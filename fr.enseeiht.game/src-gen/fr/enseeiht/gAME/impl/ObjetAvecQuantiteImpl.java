/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gAME.impl;

import fr.enseeiht.gAME.GAMEPackage;
import fr.enseeiht.gAME.Objet;
import fr.enseeiht.gAME.ObjetAvecQuantite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objet Avec Quantite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gAME.impl.ObjetAvecQuantiteImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.ObjetAvecQuantiteImpl#getObjet <em>Objet</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.ObjetAvecQuantiteImpl#getQuantite <em>Quantite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjetAvecQuantiteImpl extends MinimalEObjectImpl.Container implements ObjetAvecQuantite
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getObjet() <em>Objet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjet()
   * @generated
   * @ordered
   */
  protected Objet objet;

  /**
   * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantite()
   * @generated
   * @ordered
   */
  protected static final int QUANTITE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantite()
   * @generated
   * @ordered
   */
  protected int quantite = QUANTITE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjetAvecQuantiteImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GAMEPackage.Literals.OBJET_AVEC_QUANTITE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.OBJET_AVEC_QUANTITE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Objet getObjet()
  {
    if (objet != null && objet.eIsProxy())
    {
      InternalEObject oldObjet = (InternalEObject)objet;
      objet = (Objet)eResolveProxy(oldObjet);
      if (objet != oldObjet)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GAMEPackage.OBJET_AVEC_QUANTITE__OBJET, oldObjet, objet));
      }
    }
    return objet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objet basicGetObjet()
  {
    return objet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObjet(Objet newObjet)
  {
    Objet oldObjet = objet;
    objet = newObjet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.OBJET_AVEC_QUANTITE__OBJET, oldObjet, objet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getQuantite()
  {
    return quantite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQuantite(int newQuantite)
  {
    int oldQuantite = quantite;
    quantite = newQuantite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.OBJET_AVEC_QUANTITE__QUANTITE, oldQuantite, quantite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GAMEPackage.OBJET_AVEC_QUANTITE__NAME:
        return getName();
      case GAMEPackage.OBJET_AVEC_QUANTITE__OBJET:
        if (resolve) return getObjet();
        return basicGetObjet();
      case GAMEPackage.OBJET_AVEC_QUANTITE__QUANTITE:
        return getQuantite();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GAMEPackage.OBJET_AVEC_QUANTITE__NAME:
        setName((String)newValue);
        return;
      case GAMEPackage.OBJET_AVEC_QUANTITE__OBJET:
        setObjet((Objet)newValue);
        return;
      case GAMEPackage.OBJET_AVEC_QUANTITE__QUANTITE:
        setQuantite((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GAMEPackage.OBJET_AVEC_QUANTITE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GAMEPackage.OBJET_AVEC_QUANTITE__OBJET:
        setObjet((Objet)null);
        return;
      case GAMEPackage.OBJET_AVEC_QUANTITE__QUANTITE:
        setQuantite(QUANTITE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GAMEPackage.OBJET_AVEC_QUANTITE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GAMEPackage.OBJET_AVEC_QUANTITE__OBJET:
        return objet != null;
      case GAMEPackage.OBJET_AVEC_QUANTITE__QUANTITE:
        return quantite != QUANTITE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", quantite: ");
    result.append(quantite);
    result.append(')');
    return result.toString();
  }

} //ObjetAvecQuantiteImpl
