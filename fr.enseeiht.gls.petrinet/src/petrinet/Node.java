/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Node#getIn <em>In</em>}</li>
 *   <li>{@link petrinet.Node#getOut <em>Out</em>}</li>
 *   <li>{@link petrinet.Node#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends PetriNetElement {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petrinet.PetrinetPackage#getNode_In()
	 * @see petrinet.Arc#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Arc> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petrinet.PetrinetPackage#getNode_Out()
	 * @see petrinet.Arc#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Arc> getOut();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Node
