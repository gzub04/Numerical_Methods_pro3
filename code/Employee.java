/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mlezka
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Employee {
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
	private String address;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String email;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String phone_number;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String position;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String username;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String password;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String privilages;
	
	public Employee(String first_name, String last_name, String position, String address) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.position = position;
	}
	// Getter
	public String getFirstName() {
		return first_name;
	}
	// Setter
	public void setFirstName(String newFirstName) {
		this.first_name = newFirstName;
	}
	// Getter
	public String getLastName() {
	    return last_name;
	}
	// Setter
	public void setLastName(String newLastName) {
		this.last_name = newLastName;
	}
	// Getter
	public String getAddress() {
	    return address;
	}
	// Setter
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	// Getter
	public String getEmail() {
	    return email;
	}
	// Setter
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	// Getter
	public String getPhoneNumber() {
	    return phone_number;
	}
	// Setter
	public void setPhoneNumber(String newPhoneNumber) {
		this.phone_number = newPhoneNumber;
	}
	// Getter
	public String getPosition() {
	    return position;
	}
	// Setter
	public void setPosition(String newPosition) {
		this.position= newPosition;
	}
	// Getter
	public String getUsername() {
	    return username;
	}
	// Setter
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	// Getter
	public String getPassword() {
	    return password;
	}
	// Setter
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
	// Getter
	public String getPrivilages() {
	    return privilages;
	}
	// Setter
	public void setPrivilages(String newPrivilages) {
		this.privilages = newPrivilages;
	}
}