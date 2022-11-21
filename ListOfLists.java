
import java.util.ArrayList;
import java.util.List;


public class ListOfLists {
	
	public static ArrayList<list> mList = new ArrayList<list>();

	/*
	 * The list which hold many toDoList.
	 */
//	public List<list> lists;


//	public ListOfLists() {
//		lists = new ArrayList<list>();
//	}


//	public void addList(list name) {
//		list listToAdd = new list();
//		lists.add(listToAdd);
//	}

	/**
	 * Remove a list with the same name as the id. If there is not a list with that
	 * name, return null
	 * 
	 */
	public list removeList(String id) {
		for (list aList : mList) {
			if (aList.getName().equals(id)) {
				mList.remove(aList);
				return aList;
			}
		}
		return null;
	}


	public list getList(String name) {
		for (list list : mList) {
			if (list.getName().equals(name))
				return list;
		}

		return null;
	}

	public Task getTask(String nameList, String nameTask) {
		for (list list : mList) {
			if (list.getName().equals(nameList)) {
				return list.getTask(nameTask);
			}
		}
		return null;
	}


	public boolean addTask(String nameList, Task newTask) {
		list myList = this.getList(nameList);
		if (myList == null) {
			return false;
		} else {
			myList.addTask(newTask);
			return true;
		}
	}


	public Task removeTask(String listName, String taskName) {
		for (list list : mList) {
			if (list.getName().equals(listName)) {
				return list.removeTask(taskName);
			}
		}
		return null;
	}
	
	public List<list> getAll() {
		return mList;
	}




}