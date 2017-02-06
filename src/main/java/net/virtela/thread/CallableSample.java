package net.virtela.thread;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import net.virtela.model.Student;
import net.virtela.service.impl.SchoolServiceImpl;
import net.virtela.utils.CommonHelper;

public class CallableSample {

	private static enum RETURN_TYPE {
		STUDENT, SECTION, GRADE
	};

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("Starting test...");

		final SchoolServiceImpl service = new SchoolServiceImpl();

		/** NON-Threaded **/
		final Timestamp startNonThread = new Timestamp(Instant.now().toEpochMilli());
		service.getStudent(1l);
		service.getStudentList();
		final Timestamp endNonThread = new Timestamp(Instant.now().toEpochMilli());
		System.out.println("Non Thread Speed: " + CommonHelper.dateDiff(startNonThread, endNonThread, CommonHelper.DIFF_TYPE_SECONDS) + " Seconds.");

		/** Threaded **/
		final Timestamp startThread = new Timestamp(Instant.now().toEpochMilli());
		Callable<Student> callGetStudent = () -> {
			return service.getStudent(1l);
		};
		Callable<List<Student>> callGetStudentList = () -> {
			return service.getStudentList();
		};
		final ExecutorService pool = Executors.newFixedThreadPool(2);
		final Future<Student> futureStudent = pool.submit(callGetStudent);
		final Future<List<Student>> futureStudentList = pool.submit(callGetStudentList);
		final Student student = futureStudent.get();
		final List<Student> studentList = futureStudentList.get();
		final Timestamp endThread = new Timestamp(Instant.now().toEpochMilli());
		System.out.println("Thread Speed: " + CommonHelper.dateDiff(startThread, endThread, CommonHelper.DIFF_TYPE_SECONDS) + " Seconds.");
		pool.shutdown();
		while (!pool.isTerminated()) {
		}

		System.out.println("Done!!");
	}

}
