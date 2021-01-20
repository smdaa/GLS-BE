/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gAME;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explorateur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gAME.Explorateur#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.Explorateur#getTaille <em>Taille</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.Explorateur#getObjets <em>Objets</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.Explorateur#getConnaissances <em>Connaissances</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.Explorateur#getLocalisation <em>Localisation</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.gAME.GAMEPackage#getExplorateur()
 * @model
 * @generated
 */
public interface Explorateur extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.enseeiht.gAME.GAMEPackage#getExplorateur_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.gAME.Explorateur#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Taille</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Taille</em>' attribute.
   * @see #setTaille(int)
   * @see fr.enseeiht.gAME.GAMEPackage#getExplorateur_Taille()
   * @model
   * @generated
   */
  int getTaille();

  /**
   * Sets the value of the '{@link fr.enseeiht.gAME.Explorateur#getTaille <em>Taille</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Taille</em>' attribute.
   * @see #getTaille()
   * @generated
   */
  void setTaille(int value);

  /**
   * Returns the value of the '<em><b>Objets</b></em>' reference list.
   * The list contents are of type {@link fr.enseeiht.gAME.ObjetAvecQuantite}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objets</em>' reference list.
   * @see fr.enseeiht.gAME.GAMEPackage#getExplorateur_Objets()
   * @model
   * @generated
   */
  EList<ObjetAvecQuantite> getObjets();

  /**
   * Returns the value of the '<em><b>Connaissances</b></em>' reference list.
   * The list contents are of type {@link fr.enseeiht.gAME.Connaissance}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connaissances</em>' reference list.
   * @see fr.enseeiht.gAME.GAMEPackage#getExplorateur_Connaissances()
   * @model
   * @generated
   */
  EList<Connaissance> getConnaissances();

  /**
   * Returns the value of the '<em><b>Localisation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Localisation</em>' reference.
   * @see #setLocalisation(Lieu)
   * @see fr.enseeiht.gAME.GAMEPackage#getExplorateur_Localisation()
   * @model
   * @generated
   */
  Lieu getLocalisation();

  /**
   * Sets the value of the '{@link fr.enseeiht.gAME.Explorateur#getLocalisation <em>Localisation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Localisation</em>' reference.
   * @see #getLocalisation()
   * @generated
   */
  void setLocalisation(Lieu value);

} // Explorateur
