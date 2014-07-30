/**
 */
package cm.repository.impl;

import cm.composition.impl.EntityImpl;

import cm.repository.CompositeDataType;
import cm.repository.DataType;
import cm.repository.InnerDeclaration;
import cm.repository.Repository;
import cm.repository.RepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.repository.impl.CompositeDataTypeImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link cm.repository.impl.CompositeDataTypeImpl#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link cm.repository.impl.CompositeDataTypeImpl#getInnerDeclaration <em>Inner Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeDataTypeImpl extends EntityImpl implements CompositeDataType {
	/**
	 * The cached value of the '{@link #getParentType() <em>Parent Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentType()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeDataType> parentType;

	/**
	 * The cached value of the '{@link #getInnerDeclaration() <em>Inner Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<InnerDeclaration> innerDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.COMPOSITE_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		if (eContainerFeatureID() != RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY) return null;
		return (Repository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, RepositoryPackage.REPOSITORY__DATA_TYPES, Repository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeDataType> getParentType() {
		if (parentType == null) {
			parentType = new EObjectResolvingEList<CompositeDataType>(CompositeDataType.class, this, RepositoryPackage.COMPOSITE_DATA_TYPE__PARENT_TYPE);
		}
		return parentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InnerDeclaration> getInnerDeclaration() {
		if (innerDeclaration == null) {
			innerDeclaration = new EObjectContainmentWithInverseEList<InnerDeclaration>(InnerDeclaration.class, this, RepositoryPackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION, RepositoryPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE);
		}
		return innerDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((Repository)otherEnd, msgs);
			case RepositoryPackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInnerDeclaration()).basicAdd(otherEnd, msgs);
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
			case RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY:
				return basicSetRepository(null, msgs);
			case RepositoryPackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				return ((InternalEList<?>)getInnerDeclaration()).basicRemove(otherEnd, msgs);
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
			case RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, RepositoryPackage.REPOSITORY__DATA_TYPES, Repository.class, msgs);
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
			case RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY:
				return getRepository();
			case RepositoryPackage.COMPOSITE_DATA_TYPE__PARENT_TYPE:
				return getParentType();
			case RepositoryPackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				return getInnerDeclaration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY:
				setRepository((Repository)newValue);
				return;
			case RepositoryPackage.COMPOSITE_DATA_TYPE__PARENT_TYPE:
				getParentType().clear();
				getParentType().addAll((Collection<? extends CompositeDataType>)newValue);
				return;
			case RepositoryPackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				getInnerDeclaration().clear();
				getInnerDeclaration().addAll((Collection<? extends InnerDeclaration>)newValue);
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
			case RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY:
				setRepository((Repository)null);
				return;
			case RepositoryPackage.COMPOSITE_DATA_TYPE__PARENT_TYPE:
				getParentType().clear();
				return;
			case RepositoryPackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				getInnerDeclaration().clear();
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
			case RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY:
				return getRepository() != null;
			case RepositoryPackage.COMPOSITE_DATA_TYPE__PARENT_TYPE:
				return parentType != null && !parentType.isEmpty();
			case RepositoryPackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				return innerDeclaration != null && !innerDeclaration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
				case RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY: return RepositoryPackage.DATA_TYPE__REPOSITORY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
				case RepositoryPackage.DATA_TYPE__REPOSITORY: return RepositoryPackage.COMPOSITE_DATA_TYPE__REPOSITORY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CompositeDataTypeImpl
