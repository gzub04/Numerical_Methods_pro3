/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * NEW STUFF IN:
 * Children_group: Boolean find_child(Child child)
 * Children_group: ArrayList<Child> getChildren()
 * RENAME IN:
 * Teacher_Access: view_group
 * OTHER CHANGES:
 * changed to protected in Teacher_Access:
 * protected Children_Group_Collection children_Group_Collection
 * protected Children_Collection children_Collection
 * <!-- end-UML-doc -->
 * @author mlezka
 */
public class Manager_Access extends Teacher_Access {
	
	private Employees_Collection employees_Collection;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param name
	 * @param teacher
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer create_children_group(String name, Employee teacher) {
		Integer result = this.children_Group_Collection.create_new_group(name, teacher);
		return result;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param children_group
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer remove_children_group(Children_group children_group) {
		Integer result = this.children_Group_Collection.remove_group(children_group);
		return result;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param children_group
	 * @param teacher
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void edit_children_group_teacher(Children_group children_group,
			Employee teacher) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param children_group
	 * @param child
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void edit_children_group_add_child(Children_group children_group,
			Child child) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param children_group
	 * @param child
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void edit_children_group_remove_child(Children_group children_group,
			Child child) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void see_all_employees() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param children_group
	 * @param day
	 * @param classNo
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void change_timetable(Children_group children_group, int day,
			int classNo) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}