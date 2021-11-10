package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ToDoListTest extends TestCase {
   // Define Test Fixtures
	private ToDoList toDoList;
	private Task t1, t2;
	
   public ToDoListTest() {
      super();
   }

   @Before
   public void setUp() throws Exception {
      // Initialise Test Fixtures
	   toDoList = new ToDoList();
	   t1 = new Task("Task 1");
	   t2 = new Task("Task 2",true);
   }

   @After
   public void tearDown() throws Exception {
      // Uninitialise test Fixtures
   }

   @Test
   public void testAddTask() {
      //fail("Not implemented yet");
	  toDoList.addTask(t1);
	  assertFalse(toDoList.getAllTasks().isEmpty());
   }

   @Test
   public void testGetStatus() {
      //fail("Not implemented yet");
	  toDoList.addTask(t2);
	  boolean status = toDoList.getStatus("Task 2");
	  assertTrue(status);
   }

   @Test
   public void testRemoveTask() {
      //fail("Not implemented yet");
	  toDoList.addTask(t1);
	  toDoList.removeTask("Task 1");
	  assertTrue(toDoList.getAllTasks().isEmpty());
   }

   @Test
   public void testGetCompletedTasks() {
      //fail("Not implemented yet");
	  toDoList.addTask(t1);
	  Task task = toDoList.getTask("Task 1");
	  task.setComplete(true);
	  assertTrue(toDoList.getCompletedTasks().contains(task));
   }
}
