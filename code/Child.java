/**
 * 
 */

import java.util.Calendar;
import java.time.Year;

/** 
 * <!-- begin-UML-doc -->
 * <p>Made based of birth_date</p>
 * <!-- end-UML-doc -->
 * @author mlezka
 */
public class Child {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String first_name;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String last_name;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Calendar birth_date;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
//	private int age = Year.now().getValue() - birth_date.get(Calendar.YEAR);
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String parent_contact_number;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Children_group children_group;
	
	// Getter
	public String getFirstName() {
	    return first_name;
	}
	// Setter
	public void setFirstName(String newName) {
		this.first_name = newName;
	}
	// Getter
	public String getLastName() {
    return last_name;
	}
	// Setter
	public void setLastName(String newName) {
		this.last_name = newName;
	}
}