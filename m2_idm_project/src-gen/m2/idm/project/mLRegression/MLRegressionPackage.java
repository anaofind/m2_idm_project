/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see m2.idm.project.mLRegression.MLRegressionFactory
 * @model kind="package"
 * @generated
 */
public interface MLRegressionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mLRegression";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.idm.m2/project/MLRegression";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mLRegression";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MLRegressionPackage eINSTANCE = m2.idm.project.mLRegression.impl.MLRegressionPackageImpl.init();

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.MLRegressionImpl <em>ML Regression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.MLRegressionImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getMLRegression()
   * @generated
   */
  int ML_REGRESSION = 0;

  /**
   * The feature id for the '<em><b>Dataset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ML_REGRESSION__DATASET = 0;

  /**
   * The feature id for the '<em><b>Learning Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ML_REGRESSION__LEARNING_TYPE = 1;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ML_REGRESSION__VARS = 2;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ML_REGRESSION__RETURN_TYPE = 3;

  /**
   * The number of structural features of the '<em>ML Regression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ML_REGRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.DatasetImpl <em>Dataset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.DatasetImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getDataset()
   * @generated
   */
  int DATASET = 1;

  /**
   * The feature id for the '<em><b>Dataset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__DATASET = 0;

  /**
   * The feature id for the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__DATA = 1;

  /**
   * The number of structural features of the '<em>Dataset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.LearningTypeImpl <em>Learning Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.LearningTypeImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getLearningType()
   * @generated
   */
  int LEARNING_TYPE = 2;

  /**
   * The feature id for the '<em><b>Training</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEARNING_TYPE__TRAINING = 0;

  /**
   * The feature id for the '<em><b>Cross Validation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEARNING_TYPE__CROSS_VALIDATION = 1;

  /**
   * The number of structural features of the '<em>Learning Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEARNING_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.TrainingImpl <em>Training</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.TrainingImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getTraining()
   * @generated
   */
  int TRAINING = 3;

  /**
   * The feature id for the '<em><b>Training</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAINING__TRAINING = 0;

  /**
   * The number of structural features of the '<em>Training</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAINING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.VariablesImpl <em>Variables</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.VariablesImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getVariables()
   * @generated
   */
  int VARIABLES = 4;

  /**
   * The feature id for the '<em><b>Predictives</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES__PREDICTIVES = 0;

  /**
   * The feature id for the '<em><b>Targets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES__TARGETS = 1;

  /**
   * The number of structural features of the '<em>Variables</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.PredictivesImpl <em>Predictives</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.PredictivesImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getPredictives()
   * @generated
   */
  int PREDICTIVES = 5;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICTIVES__VARS = 0;

  /**
   * The number of structural features of the '<em>Predictives</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICTIVES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.TargetsImpl <em>Targets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.TargetsImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getTargets()
   * @generated
   */
  int TARGETS = 6;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGETS__VAR = 0;

  /**
   * The number of structural features of the '<em>Targets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGETS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.VarImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getVar()
   * @generated
   */
  int VAR = 7;

  /**
   * The feature id for the '<em><b>Name Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__NAME_VAR = 0;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.ReturnTypeImpl <em>Return Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.ReturnTypeImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getReturnType()
   * @generated
   */
  int RETURN_TYPE = 8;

  /**
   * The feature id for the '<em><b>Name Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_TYPE__NAME_RETURN = 0;

  /**
   * The number of structural features of the '<em>Return Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.TypeValueImpl <em>Type Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.TypeValueImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getTypeValue()
   * @generated
   */
  int TYPE_VALUE = 9;

  /**
   * The number of structural features of the '<em>Type Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.StringValueImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = TYPE_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = TYPE_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.NumberValueImpl <em>Number Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.NumberValueImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getNumberValue()
   * @generated
   */
  int NUMBER_VALUE = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE__VALUE = TYPE_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Decimal</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE__DECIMAL = TYPE_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE_FEATURE_COUNT = TYPE_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.PercentValueImpl <em>Percent Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.PercentValueImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getPercentValue()
   * @generated
   */
  int PERCENT_VALUE = 12;

  /**
   * The number of structural features of the '<em>Percent Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERCENT_VALUE_FEATURE_COUNT = TYPE_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link m2.idm.project.mLRegression.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see m2.idm.project.mLRegression.impl.BooleanValueImpl
   * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = TYPE_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = TYPE_VALUE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.MLRegression <em>ML Regression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ML Regression</em>'.
   * @see m2.idm.project.mLRegression.MLRegression
   * @generated
   */
  EClass getMLRegression();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.MLRegression#getDataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dataset</em>'.
   * @see m2.idm.project.mLRegression.MLRegression#getDataset()
   * @see #getMLRegression()
   * @generated
   */
  EReference getMLRegression_Dataset();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.MLRegression#getLearningType <em>Learning Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Learning Type</em>'.
   * @see m2.idm.project.mLRegression.MLRegression#getLearningType()
   * @see #getMLRegression()
   * @generated
   */
  EReference getMLRegression_LearningType();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.MLRegression#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vars</em>'.
   * @see m2.idm.project.mLRegression.MLRegression#getVars()
   * @see #getMLRegression()
   * @generated
   */
  EReference getMLRegression_Vars();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.MLRegression#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see m2.idm.project.mLRegression.MLRegression#getReturnType()
   * @see #getMLRegression()
   * @generated
   */
  EReference getMLRegression_ReturnType();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.Dataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dataset</em>'.
   * @see m2.idm.project.mLRegression.Dataset
   * @generated
   */
  EClass getDataset();

  /**
   * Returns the meta object for the attribute '{@link m2.idm.project.mLRegression.Dataset#getDataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dataset</em>'.
   * @see m2.idm.project.mLRegression.Dataset#getDataset()
   * @see #getDataset()
   * @generated
   */
  EAttribute getDataset_Dataset();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.Dataset#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data</em>'.
   * @see m2.idm.project.mLRegression.Dataset#getData()
   * @see #getDataset()
   * @generated
   */
  EReference getDataset_Data();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.LearningType <em>Learning Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Learning Type</em>'.
   * @see m2.idm.project.mLRegression.LearningType
   * @generated
   */
  EClass getLearningType();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.LearningType#getTraining <em>Training</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Training</em>'.
   * @see m2.idm.project.mLRegression.LearningType#getTraining()
   * @see #getLearningType()
   * @generated
   */
  EReference getLearningType_Training();

  /**
   * Returns the meta object for the attribute '{@link m2.idm.project.mLRegression.LearningType#getCrossValidation <em>Cross Validation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cross Validation</em>'.
   * @see m2.idm.project.mLRegression.LearningType#getCrossValidation()
   * @see #getLearningType()
   * @generated
   */
  EAttribute getLearningType_CrossValidation();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.Training <em>Training</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Training</em>'.
   * @see m2.idm.project.mLRegression.Training
   * @generated
   */
  EClass getTraining();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.Training#getTraining <em>Training</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Training</em>'.
   * @see m2.idm.project.mLRegression.Training#getTraining()
   * @see #getTraining()
   * @generated
   */
  EReference getTraining_Training();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.Variables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables</em>'.
   * @see m2.idm.project.mLRegression.Variables
   * @generated
   */
  EClass getVariables();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.Variables#getPredictives <em>Predictives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predictives</em>'.
   * @see m2.idm.project.mLRegression.Variables#getPredictives()
   * @see #getVariables()
   * @generated
   */
  EReference getVariables_Predictives();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.Variables#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Targets</em>'.
   * @see m2.idm.project.mLRegression.Variables#getTargets()
   * @see #getVariables()
   * @generated
   */
  EReference getVariables_Targets();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.Predictives <em>Predictives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predictives</em>'.
   * @see m2.idm.project.mLRegression.Predictives
   * @generated
   */
  EClass getPredictives();

  /**
   * Returns the meta object for the containment reference list '{@link m2.idm.project.mLRegression.Predictives#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see m2.idm.project.mLRegression.Predictives#getVars()
   * @see #getPredictives()
   * @generated
   */
  EReference getPredictives_Vars();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.Targets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Targets</em>'.
   * @see m2.idm.project.mLRegression.Targets
   * @generated
   */
  EClass getTargets();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.Targets#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see m2.idm.project.mLRegression.Targets#getVar()
   * @see #getTargets()
   * @generated
   */
  EReference getTargets_Var();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see m2.idm.project.mLRegression.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.Var#getNameVar <em>Name Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Var</em>'.
   * @see m2.idm.project.mLRegression.Var#getNameVar()
   * @see #getVar()
   * @generated
   */
  EReference getVar_NameVar();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.ReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Type</em>'.
   * @see m2.idm.project.mLRegression.ReturnType
   * @generated
   */
  EClass getReturnType();

  /**
   * Returns the meta object for the containment reference '{@link m2.idm.project.mLRegression.ReturnType#getNameReturn <em>Name Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Return</em>'.
   * @see m2.idm.project.mLRegression.ReturnType#getNameReturn()
   * @see #getReturnType()
   * @generated
   */
  EReference getReturnType_NameReturn();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.TypeValue <em>Type Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Value</em>'.
   * @see m2.idm.project.mLRegression.TypeValue
   * @generated
   */
  EClass getTypeValue();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see m2.idm.project.mLRegression.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link m2.idm.project.mLRegression.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see m2.idm.project.mLRegression.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.NumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Value</em>'.
   * @see m2.idm.project.mLRegression.NumberValue
   * @generated
   */
  EClass getNumberValue();

  /**
   * Returns the meta object for the attribute '{@link m2.idm.project.mLRegression.NumberValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see m2.idm.project.mLRegression.NumberValue#getValue()
   * @see #getNumberValue()
   * @generated
   */
  EAttribute getNumberValue_Value();

  /**
   * Returns the meta object for the attribute list '{@link m2.idm.project.mLRegression.NumberValue#getDecimal <em>Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Decimal</em>'.
   * @see m2.idm.project.mLRegression.NumberValue#getDecimal()
   * @see #getNumberValue()
   * @generated
   */
  EAttribute getNumberValue_Decimal();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.PercentValue <em>Percent Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Percent Value</em>'.
   * @see m2.idm.project.mLRegression.PercentValue
   * @generated
   */
  EClass getPercentValue();

  /**
   * Returns the meta object for class '{@link m2.idm.project.mLRegression.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see m2.idm.project.mLRegression.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link m2.idm.project.mLRegression.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see m2.idm.project.mLRegression.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MLRegressionFactory getMLRegressionFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.MLRegressionImpl <em>ML Regression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.MLRegressionImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getMLRegression()
     * @generated
     */
    EClass ML_REGRESSION = eINSTANCE.getMLRegression();

    /**
     * The meta object literal for the '<em><b>Dataset</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ML_REGRESSION__DATASET = eINSTANCE.getMLRegression_Dataset();

    /**
     * The meta object literal for the '<em><b>Learning Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ML_REGRESSION__LEARNING_TYPE = eINSTANCE.getMLRegression_LearningType();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ML_REGRESSION__VARS = eINSTANCE.getMLRegression_Vars();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ML_REGRESSION__RETURN_TYPE = eINSTANCE.getMLRegression_ReturnType();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.DatasetImpl <em>Dataset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.DatasetImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getDataset()
     * @generated
     */
    EClass DATASET = eINSTANCE.getDataset();

    /**
     * The meta object literal for the '<em><b>Dataset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATASET__DATASET = eINSTANCE.getDataset_Dataset();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATASET__DATA = eINSTANCE.getDataset_Data();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.LearningTypeImpl <em>Learning Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.LearningTypeImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getLearningType()
     * @generated
     */
    EClass LEARNING_TYPE = eINSTANCE.getLearningType();

    /**
     * The meta object literal for the '<em><b>Training</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEARNING_TYPE__TRAINING = eINSTANCE.getLearningType_Training();

    /**
     * The meta object literal for the '<em><b>Cross Validation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEARNING_TYPE__CROSS_VALIDATION = eINSTANCE.getLearningType_CrossValidation();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.TrainingImpl <em>Training</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.TrainingImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getTraining()
     * @generated
     */
    EClass TRAINING = eINSTANCE.getTraining();

    /**
     * The meta object literal for the '<em><b>Training</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAINING__TRAINING = eINSTANCE.getTraining_Training();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.VariablesImpl <em>Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.VariablesImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getVariables()
     * @generated
     */
    EClass VARIABLES = eINSTANCE.getVariables();

    /**
     * The meta object literal for the '<em><b>Predictives</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLES__PREDICTIVES = eINSTANCE.getVariables_Predictives();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLES__TARGETS = eINSTANCE.getVariables_Targets();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.PredictivesImpl <em>Predictives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.PredictivesImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getPredictives()
     * @generated
     */
    EClass PREDICTIVES = eINSTANCE.getPredictives();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICTIVES__VARS = eINSTANCE.getPredictives_Vars();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.TargetsImpl <em>Targets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.TargetsImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getTargets()
     * @generated
     */
    EClass TARGETS = eINSTANCE.getTargets();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGETS__VAR = eINSTANCE.getTargets_Var();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.VarImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '<em><b>Name Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR__NAME_VAR = eINSTANCE.getVar_NameVar();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.ReturnTypeImpl <em>Return Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.ReturnTypeImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getReturnType()
     * @generated
     */
    EClass RETURN_TYPE = eINSTANCE.getReturnType();

    /**
     * The meta object literal for the '<em><b>Name Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_TYPE__NAME_RETURN = eINSTANCE.getReturnType_NameReturn();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.TypeValueImpl <em>Type Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.TypeValueImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getTypeValue()
     * @generated
     */
    EClass TYPE_VALUE = eINSTANCE.getTypeValue();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.StringValueImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.NumberValueImpl <em>Number Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.NumberValueImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getNumberValue()
     * @generated
     */
    EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_VALUE__VALUE = eINSTANCE.getNumberValue_Value();

    /**
     * The meta object literal for the '<em><b>Decimal</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_VALUE__DECIMAL = eINSTANCE.getNumberValue_Decimal();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.PercentValueImpl <em>Percent Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.PercentValueImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getPercentValue()
     * @generated
     */
    EClass PERCENT_VALUE = eINSTANCE.getPercentValue();

    /**
     * The meta object literal for the '{@link m2.idm.project.mLRegression.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m2.idm.project.mLRegression.impl.BooleanValueImpl
     * @see m2.idm.project.mLRegression.impl.MLRegressionPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

  }

} //MLRegressionPackage