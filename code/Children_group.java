/**
 * 
 */

import java.util.Set;
import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mlezka
 */
public class Children_group {
	private String name;
//	private Children_Group_Collection children_Group_Collection;
	private ArrayList<Child> children = new ArrayList<Child>();
	private Employee teacher;
	private Set<Timetable> timetable;
	
	public Integer create_group(String name, Employee Teacher) {
		if(Teacher.getPosition() != "Teacher")
			return -1;
		this.name = name;
		this.teacher = Teacher;
		return 0;
	}

	public void add_child(Child child) {
		children.add(child);
	}

	public Integer remove_child(Child child) {
		int index = children.indexOf(child);
		if(index == -1)
			return -1;
		children.remove(index);
		return 0;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void edit_teacher(Employee teacher) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	
	// Getter
	public String getName() {
	    return name;
	}
	// Setter
	public void setName(String newName) {
		this.name= newName;
	}
	// Setter
	public void setTeacher(Employee newTeacher) {
		this.teacher= newTeacher;
	}
	
	// Getter
	public Employee getTeacher() {
	    return teacher;
	}
	
	public Boolean find_child(Child child) {
		if(children.contains(child))
			return true;
		else
			return false;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void view_group() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	
	public ArrayList<Child> getChildren() {
		return this.children;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void remove_group() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}



}