/**
 */
package cm.repository.impl;

import cm.composition.impl.NamedElementImpl;

import cm.repository.CompositeDataType;
import cm.repository.DataType;
import cm.repository.InnerDeclaration;
import cm.repository.RepositoryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inner Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.repository.impl.InnerDeclarationImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link cm.repository.impl.InnerDeclarationImpl#getCompositeDataType <em>Composite Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InnerDeclarationImpl extends NamedElementImpl implements InnerDeclaration {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.INNER_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.INNER_DECLARATION__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.INNER_DECLARATION__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDataType getCompositeDataType() {
		if (eContainerFeatureID() != RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE) return null;
		return (CompositeDataType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeDataType(CompositeDataType newCompositeDataType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompositeDataType, RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeDataType(CompositeDataType newCompositeDataType) {
		if (newCompositeDataType != eInternalContainer() || (eContainerFeatureID() != RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE && newCompositeDataType != null)) {
			if (EcoreUtil.isAncestor(this, newCompositeDataType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompositeDataType != null)
				msgs = ((InternalEObject)newCompositeDataType).eInverseAdd(this, RepositoryPackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION, CompositeDataType.class, msgs);
			msgs = basicSetCompositeDataType(newCompositeDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE, newCompositeDataType, newCompositeDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompositeDataType((CompositeDataType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE:
				return basicSetCompositeDataType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE:
				return eInternalContainer().eInverseRemove(this, RepositoryPackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION, CompositeDataType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.INNER_DECLARATION__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE:
				return getCompositeDataType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RepositoryPackage.INNER_DECLARATION__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE:
				setCompositeDataType((CompositeDataType)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case RepositoryPackage.INNER_DECLARATION__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE:
				setCompositeDataType((CompositeDataType)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RepositoryPackage.INNER_DECLARATION__DATA_TYPE:
				return dataType != null;
			case RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE:
				return getCompositeDataType() != null;
		}
		return super.eIsSet(featureID);
	}

} //InnerDeclarationImpl
