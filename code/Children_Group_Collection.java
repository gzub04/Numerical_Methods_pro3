/**
 * 
 */

import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mlezka
 */
public class Children_Group_Collection {
	private ArrayList<Children_group> children_groups = new ArrayList<Children_group>();
	private Teacher_Access teacher_Access;
	
	
	// Getter
	public ArrayList<Children_group> getChildrenGroups() {
		return this.children_groups;
	}
	public Children_group get_group(String Parameter) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
	
	public Integer create_new_group(String name, Employee teacher) {
		for (Children_group group : children_groups) {
			if(group.getName() == name) {
				return -1;
			}
		}
		Children_group new_group = new Children_group();
		new_group.create_group(name, teacher);
		children_groups.add(new_group);
		return 0;
	}

	public Integer remove_group(Children_group children_group) {
		if(!children_groups.remove(children_group)) {
			return -1;
		}
		return 0;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param children_group
	 * @param teacher
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void edit_teacher(Children_group children_group, Employee teacher) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param child_group
	 * @param child
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer add_child_to_group(Children_group child_group, Child child) {
		if(child_group.find_child(child)) {
			return -1;
		}
		child_group.add_child(child);
		return 0;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param children_group
	 * @param child
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer remove_child_from_group(Children_group children_group,
			Child child) {
		Integer result = children_group.remove_child(child);
		return result;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param children_group
	 * @param day
	 * @param classNo
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void edit_timetable(Children_group children_group, int day,
			int classNo) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}