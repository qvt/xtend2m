/**
 */
package cm.seff.impl;

import cm.composition.impl.EntityImpl;

import cm.seff.AbstractAction;
import cm.seff.Automaton;
import cm.seff.InternalBehaviour;
import cm.seff.SeffPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.seff.impl.AbstractActionImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link cm.seff.impl.AbstractActionImpl#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link cm.seff.impl.AbstractActionImpl#getInternalBehaviour <em>Internal Behaviour</em>}</li>
 *   <li>{@link cm.seff.impl.AbstractActionImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractActionImpl extends EntityImpl implements AbstractAction {
	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected AbstractAction predecessor;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected AbstractAction successor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.ABSTRACT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = (AbstractAction)eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.ABSTRACT_ACTION__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(AbstractAction newPredecessor, NotificationChain msgs) {
		AbstractAction oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeffPackage.ABSTRACT_ACTION__PREDECESSOR, oldPredecessor, newPredecessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(AbstractAction newPredecessor) {
		if (newPredecessor != predecessor) {
			NotificationChain msgs = null;
			if (predecessor != null)
				msgs = ((InternalEObject)predecessor).eInverseRemove(this, SeffPackage.ABSTRACT_ACTION__SUCCESSOR, AbstractAction.class, msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject)newPredecessor).eInverseAdd(this, SeffPackage.ABSTRACT_ACTION__SUCCESSOR, AbstractAction.class, msgs);
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.ABSTRACT_ACTION__PREDECESSOR, newPredecessor, newPredecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject)successor;
			successor = (AbstractAction)eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.ABSTRACT_ACTION__SUCCESSOR, oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction basicGetSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessor(AbstractAction newSuccessor, NotificationChain msgs) {
		AbstractAction oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeffPackage.ABSTRACT_ACTION__SUCCESSOR, oldSuccessor, newSuccessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor(AbstractAction newSuccessor) {
		if (newSuccessor != successor) {
			NotificationChain msgs = null;
			if (successor != null)
				msgs = ((InternalEObject)successor).eInverseRemove(this, SeffPackage.ABSTRACT_ACTION__PREDECESSOR, AbstractAction.class, msgs);
			if (newSuccessor != null)
				msgs = ((InternalEObject)newSuccessor).eInverseAdd(this, SeffPackage.ABSTRACT_ACTION__PREDECESSOR, AbstractAction.class, msgs);
			msgs = basicSetSuccessor(newSuccessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.ABSTRACT_ACTION__SUCCESSOR, newSuccessor, newSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalBehaviour getInternalBehaviour() {
		if (eContainerFeatureID() != SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR) return null;
		return (InternalBehaviour)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalBehaviour(InternalBehaviour newInternalBehaviour, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInternalBehaviour, SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalBehaviour(InternalBehaviour newInternalBehaviour) {
		if (newInternalBehaviour != eInternalContainer() || (eContainerFeatureID() != SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR && newInternalBehaviour != null)) {
			if (EcoreUtil.isAncestor(this, newInternalBehaviour))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInternalBehaviour != null)
				msgs = ((InternalEObject)newInternalBehaviour).eInverseAdd(this, SeffPackage.INTERNAL_BEHAVIOUR__STEPS, InternalBehaviour.class, msgs);
			msgs = basicSetInternalBehaviour(newInternalBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR, newInternalBehaviour, newInternalBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automaton getSpecification() {
		if (eContainerFeatureID() != SeffPackage.ABSTRACT_ACTION__SPECIFICATION) return null;
		return (Automaton)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(Automaton newSpecification, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecification, SeffPackage.ABSTRACT_ACTION__SPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(Automaton newSpecification) {
		if (newSpecification != eInternalContainer() || (eContainerFeatureID() != SeffPackage.ABSTRACT_ACTION__SPECIFICATION && newSpecification != null)) {
			if (EcoreUtil.isAncestor(this, newSpecification))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, SeffPackage.AUTOMATON__STEPS, Automaton.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.ABSTRACT_ACTION__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.ABSTRACT_ACTION__PREDECESSOR:
				if (predecessor != null)
					msgs = ((InternalEObject)predecessor).eInverseRemove(this, SeffPackage.ABSTRACT_ACTION__SUCCESSOR, AbstractAction.class, msgs);
				return basicSetPredecessor((AbstractAction)otherEnd, msgs);
			case SeffPackage.ABSTRACT_ACTION__SUCCESSOR:
				if (successor != null)
					msgs = ((InternalEObject)successor).eInverseRemove(this, SeffPackage.ABSTRACT_ACTION__PREDECESSOR, AbstractAction.class, msgs);
				return basicSetSuccessor((AbstractAction)otherEnd, msgs);
			case SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInternalBehaviour((InternalBehaviour)otherEnd, msgs);
			case SeffPackage.ABSTRACT_ACTION__SPECIFICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecification((Automaton)otherEnd, msgs);
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
			case SeffPackage.ABSTRACT_ACTION__PREDECESSOR:
				return basicSetPredecessor(null, msgs);
			case SeffPackage.ABSTRACT_ACTION__SUCCESSOR:
				return basicSetSuccessor(null, msgs);
			case SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR:
				return basicSetInternalBehaviour(null, msgs);
			case SeffPackage.ABSTRACT_ACTION__SPECIFICATION:
				return basicSetSpecification(null, msgs);
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
			case SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR:
				return eInternalContainer().eInverseRemove(this, SeffPackage.INTERNAL_BEHAVIOUR__STEPS, InternalBehaviour.class, msgs);
			case SeffPackage.ABSTRACT_ACTION__SPECIFICATION:
				return eInternalContainer().eInverseRemove(this, SeffPackage.AUTOMATON__STEPS, Automaton.class, msgs);
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
			case SeffPackage.ABSTRACT_ACTION__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
			case SeffPackage.ABSTRACT_ACTION__SUCCESSOR:
				if (resolve) return getSuccessor();
				return basicGetSuccessor();
			case SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR:
				return getInternalBehaviour();
			case SeffPackage.ABSTRACT_ACTION__SPECIFICATION:
				return getSpecification();
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
			case SeffPackage.ABSTRACT_ACTION__PREDECESSOR:
				setPredecessor((AbstractAction)newValue);
				return;
			case SeffPackage.ABSTRACT_ACTION__SUCCESSOR:
				setSuccessor((AbstractAction)newValue);
				return;
			case SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR:
				setInternalBehaviour((InternalBehaviour)newValue);
				return;
			case SeffPackage.ABSTRACT_ACTION__SPECIFICATION:
				setSpecification((Automaton)newValue);
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
			case SeffPackage.ABSTRACT_ACTION__PREDECESSOR:
				setPredecessor((AbstractAction)null);
				return;
			case SeffPackage.ABSTRACT_ACTION__SUCCESSOR:
				setSuccessor((AbstractAction)null);
				return;
			case SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR:
				setInternalBehaviour((InternalBehaviour)null);
				return;
			case SeffPackage.ABSTRACT_ACTION__SPECIFICATION:
				setSpecification((Automaton)null);
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
			case SeffPackage.ABSTRACT_ACTION__PREDECESSOR:
				return predecessor != null;
			case SeffPackage.ABSTRACT_ACTION__SUCCESSOR:
				return successor != null;
			case SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR:
				return getInternalBehaviour() != null;
			case SeffPackage.ABSTRACT_ACTION__SPECIFICATION:
				return getSpecification() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractActionImpl
