/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gAME;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connaissance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gAME.Connaissance#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.Connaissance#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.Connaissance#getVisibilite <em>Visibilite</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.Connaissance#getConditionsVisibilite <em>Conditions Visibilite</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.gAME.GAMEPackage#getConnaissance()
 * @model
 * @generated
 */
public interface Connaissance extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.enseeiht.gAME.GAMEPackage#getConnaissance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.gAME.Connaissance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.gAME.Description}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descriptions</em>' containment reference list.
   * @see fr.enseeiht.gAME.GAMEPackage#getConnaissance_Descriptions()
   * @model containment="true"
   * @generated
   */
  EList<Description> getDescriptions();

  /**
   * Returns the value of the '<em><b>Visibilite</b></em>' attribute.
   * The literals are from the enumeration {@link fr.enseeiht.gAME.Visibilite}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibilite</em>' attribute.
   * @see fr.enseeiht.gAME.Visibilite
   * @see #setVisibilite(Visibilite)
   * @see fr.enseeiht.gAME.GAMEPackage#getConnaissance_Visibilite()
   * @model
   * @generated
   */
  Visibilite getVisibilite();

  /**
   * Sets the value of the '{@link fr.enseeiht.gAME.Connaissance#getVisibilite <em>Visibilite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibilite</em>' attribute.
   * @see fr.enseeiht.gAME.Visibilite
   * @see #getVisibilite()
   * @generated
   */
  void setVisibilite(Visibilite value);

  /**
   * Returns the value of the '<em><b>Conditions Visibilite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions Visibilite</em>' containment reference.
   * @see #setConditionsVisibilite(Condition)
   * @see fr.enseeiht.gAME.GAMEPackage#getConnaissance_ConditionsVisibilite()
   * @model containment="true"
   * @generated
   */
  Condition getConditionsVisibilite();

  /**
   * Sets the value of the '{@link fr.enseeiht.gAME.Connaissance#getConditionsVisibilite <em>Conditions Visibilite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditions Visibilite</em>' containment reference.
   * @see #getConditionsVisibilite()
   * @generated
   */
  void setConditionsVisibilite(Condition value);

} // Connaissance
