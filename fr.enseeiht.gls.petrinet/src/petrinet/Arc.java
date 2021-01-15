/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Arc#getTo <em>To</em>}</li>
 *   <li>{@link petrinet.Arc#getFrom <em>From</em>}</li>
 *   <li>{@link petrinet.Arc#getWeight <em>Weight</em>}</li>
 *   <li>{@link petrinet.Arc#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends PetriNetElement {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Node#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Node)
	 * @see petrinet.PetrinetPackage#getArc_To()
	 * @see petrinet.Node#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	Node getTo();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Node value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Node#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Node)
	 * @see petrinet.PetrinetPackage#getArc_From()
	 * @see petrinet.Node#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	Node getFrom();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Node value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see petrinet.PetrinetPackage#getArc_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link petrinet.TypeOfArc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see petrinet.TypeOfArc
	 * @see #setType(TypeOfArc)
	 * @see petrinet.PetrinetPackage#getArc_Type()
	 * @model dataType="petrinet.TypeOfArc"
	 * @generated
	 */
	TypeOfArc getType();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see petrinet.TypeOfArc
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfArc value);

} // Arc
