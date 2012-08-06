/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks;

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
 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksFactory
 * @model kind="package"
 * @generated
 */
public interface AntTasksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "anttasks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://at.bestsolution.efxclipse.tooling.jdt/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "anttasks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AntTasksPackage eINSTANCE = at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl <em>Ant Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getAntTask()
	 * @generated
	 */
	int ANT_TASK = 0;

	/**
	 * The feature id for the '<em><b>Css To Bin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__CSS_TO_BIN = 0;

	/**
	 * The feature id for the '<em><b>Deploy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__DEPLOY = 1;

	/**
	 * The feature id for the '<em><b>Jar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__JAR = 2;

	/**
	 * The feature id for the '<em><b>Signjar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__SIGNJAR = 3;

	/**
	 * The feature id for the '<em><b>Build Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__BUILD_DIRECTORY = 4;

	/**
	 * The feature id for the '<em><b>Manifest Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__MANIFEST_ENTRIES = 5;

	/**
	 * The number of structural features of the '<em>Ant Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.CssToBinImpl <em>Css To Bin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.CssToBinImpl
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getCssToBin()
	 * @generated
	 */
	int CSS_TO_BIN = 1;

	/**
	 * The feature id for the '<em><b>Outdir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_TO_BIN__OUTDIR = 0;

	/**
	 * The feature id for the '<em><b>Fileset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_TO_BIN__FILESET = 1;

	/**
	 * The number of structural features of the '<em>Css To Bin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_TO_BIN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl <em>Deploy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getDeploy()
	 * @generated
	 */
	int DEPLOY = 2;

	/**
	 * The feature id for the '<em><b>Embedjnlp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__EMBEDJNLP = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Include DT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__INCLUDE_DT = 3;

	/**
	 * The feature id for the '<em><b>Offline Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__OFFLINE_ALLOWED = 4;

	/**
	 * The feature id for the '<em><b>Outdir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__OUTDIR = 5;

	/**
	 * The feature id for the '<em><b>Outfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__OUTFILE = 6;

	/**
	 * The feature id for the '<em><b>Placeholderref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PLACEHOLDERREF = 7;

	/**
	 * The feature id for the '<em><b>Placeholderid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PLACEHOLDERID = 8;

	/**
	 * The feature id for the '<em><b>Updatemode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__UPDATEMODE = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__WIDTH = 10;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PLATFORM = 11;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PREFERENCES = 12;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__APPLICATION = 13;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PERMISSIONS = 14;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__TEMPLATE = 15;

	/**
	 * The feature id for the '<em><b>Callbacks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__CALLBACKS = 16;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__INFO = 17;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__RESOURCES = 18;

	/**
	 * The feature id for the '<em><b>Native Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__NATIVE_PACKAGE = 19;

	/**
	 * The feature id for the '<em><b>Splash Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__SPLASH_IMAGE = 20;

	/**
	 * The number of structural features of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.JarImpl <em>Jar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.JarImpl
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getJar()
	 * @generated
	 */
	int JAR = 3;

	/**
	 * The feature id for the '<em><b>Destfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR__DESTFILE = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR__PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Fileset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR__FILESET = 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR__APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR__INFO = 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR__RESOURCES = 5;

	/**
	 * The number of structural features of the '<em>Jar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl <em>Sign Jar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getSignJar()
	 * @generated
	 */
	int SIGN_JAR = 4;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Destdir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__DESTDIR = 1;

	/**
	 * The feature id for the '<em><b>Keypass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__KEYPASS = 2;

	/**
	 * The feature id for the '<em><b>Keystore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__KEYSTORE = 3;

	/**
	 * The feature id for the '<em><b>Sourcejar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__SOURCEJAR = 4;

	/**
	 * The feature id for the '<em><b>Storepass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__STOREPASS = 5;

	/**
	 * The feature id for the '<em><b>Storetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__STORETYPE = 6;

	/**
	 * The feature id for the '<em><b>Fileset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__FILESET = 7;

	/**
	 * The number of structural features of the '<em>Sign Jar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR_FEATURE_COUNT = 8;


	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask <em>Ant Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ant Task</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask
	 * @generated
	 */
	EClass getAntTask();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getCssToBin <em>Css To Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Css To Bin</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getCssToBin()
	 * @see #getAntTask()
	 * @generated
	 */
	EReference getAntTask_CssToBin();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getDeploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deploy</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getDeploy()
	 * @see #getAntTask()
	 * @generated
	 */
	EReference getAntTask_Deploy();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getJar <em>Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jar</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getJar()
	 * @see #getAntTask()
	 * @generated
	 */
	EReference getAntTask_Jar();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getSignjar <em>Signjar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signjar</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getSignjar()
	 * @see #getAntTask()
	 * @generated
	 */
	EReference getAntTask_Signjar();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getBuildDirectory <em>Build Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Directory</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getBuildDirectory()
	 * @see #getAntTask()
	 * @generated
	 */
	EAttribute getAntTask_BuildDirectory();

	/**
	 * Returns the meta object for the reference list '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getManifestEntries <em>Manifest Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manifest Entries</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getManifestEntries()
	 * @see #getAntTask()
	 * @generated
	 */
	EReference getAntTask_ManifestEntries();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.CssToBin <em>Css To Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Css To Bin</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.CssToBin
	 * @generated
	 */
	EClass getCssToBin();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.CssToBin#getOutdir <em>Outdir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outdir</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.CssToBin#getOutdir()
	 * @see #getCssToBin()
	 * @generated
	 */
	EAttribute getCssToBin_Outdir();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.CssToBin#getFileset <em>Fileset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fileset</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.CssToBin#getFileset()
	 * @see #getCssToBin()
	 * @generated
	 */
	EReference getCssToBin_Fileset();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy
	 * @generated
	 */
	EClass getDeploy();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isEmbedjnlp <em>Embedjnlp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedjnlp</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isEmbedjnlp()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Embedjnlp();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isExtension()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Extension();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getHeight()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Height();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isIncludeDT <em>Include DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include DT</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isIncludeDT()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_IncludeDT();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isOfflineAllowed <em>Offline Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offline Allowed</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isOfflineAllowed()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_OfflineAllowed();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getOutdir <em>Outdir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outdir</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getOutdir()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Outdir();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getOutfile <em>Outfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outfile</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getOutfile()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Outfile();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderref <em>Placeholderref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholderref</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderref()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Placeholderref();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderid <em>Placeholderid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholderid</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderid()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Placeholderid();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getUpdatemode <em>Updatemode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatemode</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getUpdatemode()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Updatemode();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getWidth()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Width();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlatform()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Platform();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferences</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPreferences()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Preferences();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getApplication()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Application();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Permissions</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPermissions()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Permissions();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getTemplate()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getCallbacks <em>Callbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Callbacks</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getCallbacks()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Callbacks();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getInfo()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Info();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getResources()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Resources();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isNativePackage <em>Native Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native Package</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isNativePackage()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_NativePackage();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getSplashImage <em>Splash Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Splash Image</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getSplashImage()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_SplashImage();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar <em>Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jar</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar
	 * @generated
	 */
	EClass getJar();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getDestfile <em>Destfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destfile</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getDestfile()
	 * @see #getJar()
	 * @generated
	 */
	EAttribute getJar_Destfile();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getPlatform()
	 * @see #getJar()
	 * @generated
	 */
	EReference getJar_Platform();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getFileset <em>Fileset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fileset</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getFileset()
	 * @see #getJar()
	 * @generated
	 */
	EReference getJar_Fileset();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getApplication()
	 * @see #getJar()
	 * @generated
	 */
	EReference getJar_Application();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getInfo()
	 * @see #getJar()
	 * @generated
	 */
	EReference getJar_Info();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar#getResources()
	 * @see #getJar()
	 * @generated
	 */
	EReference getJar_Resources();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar <em>Sign Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sign Jar</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar
	 * @generated
	 */
	EClass getSignJar();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getAlias()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Alias();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getDestdir <em>Destdir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destdir</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getDestdir()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Destdir();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getKeypass <em>Keypass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keypass</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getKeypass()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Keypass();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getKeystore <em>Keystore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keystore</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getKeystore()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Keystore();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getSourcejar <em>Sourcejar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sourcejar</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getSourcejar()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Sourcejar();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getStorepass <em>Storepass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storepass</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getStorepass()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Storepass();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getStoretype <em>Storetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storetype</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getStoretype()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Storetype();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getFileset <em>Fileset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fileset</em>'.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar#getFileset()
	 * @see #getSignJar()
	 * @generated
	 */
	EReference getSignJar_Fileset();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AntTasksFactory getAntTasksFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl <em>Ant Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl
		 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getAntTask()
		 * @generated
		 */
		EClass ANT_TASK = eINSTANCE.getAntTask();

		/**
		 * The meta object literal for the '<em><b>Css To Bin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANT_TASK__CSS_TO_BIN = eINSTANCE.getAntTask_CssToBin();

		/**
		 * The meta object literal for the '<em><b>Deploy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANT_TASK__DEPLOY = eINSTANCE.getAntTask_Deploy();

		/**
		 * The meta object literal for the '<em><b>Jar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANT_TASK__JAR = eINSTANCE.getAntTask_Jar();

		/**
		 * The meta object literal for the '<em><b>Signjar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANT_TASK__SIGNJAR = eINSTANCE.getAntTask_Signjar();

		/**
		 * The meta object literal for the '<em><b>Build Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANT_TASK__BUILD_DIRECTORY = eINSTANCE.getAntTask_BuildDirectory();

		/**
		 * The meta object literal for the '<em><b>Manifest Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANT_TASK__MANIFEST_ENTRIES = eINSTANCE.getAntTask_ManifestEntries();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.CssToBinImpl <em>Css To Bin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.CssToBinImpl
		 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getCssToBin()
		 * @generated
		 */
		EClass CSS_TO_BIN = eINSTANCE.getCssToBin();

		/**
		 * The meta object literal for the '<em><b>Outdir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSS_TO_BIN__OUTDIR = eINSTANCE.getCssToBin_Outdir();

		/**
		 * The meta object literal for the '<em><b>Fileset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSS_TO_BIN__FILESET = eINSTANCE.getCssToBin_Fileset();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl <em>Deploy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl
		 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getDeploy()
		 * @generated
		 */
		EClass DEPLOY = eINSTANCE.getDeploy();

		/**
		 * The meta object literal for the '<em><b>Embedjnlp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__EMBEDJNLP = eINSTANCE.getDeploy_Embedjnlp();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__EXTENSION = eINSTANCE.getDeploy_Extension();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__HEIGHT = eINSTANCE.getDeploy_Height();

		/**
		 * The meta object literal for the '<em><b>Include DT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__INCLUDE_DT = eINSTANCE.getDeploy_IncludeDT();

		/**
		 * The meta object literal for the '<em><b>Offline Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__OFFLINE_ALLOWED = eINSTANCE.getDeploy_OfflineAllowed();

		/**
		 * The meta object literal for the '<em><b>Outdir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__OUTDIR = eINSTANCE.getDeploy_Outdir();

		/**
		 * The meta object literal for the '<em><b>Outfile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__OUTFILE = eINSTANCE.getDeploy_Outfile();

		/**
		 * The meta object literal for the '<em><b>Placeholderref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__PLACEHOLDERREF = eINSTANCE.getDeploy_Placeholderref();

		/**
		 * The meta object literal for the '<em><b>Placeholderid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__PLACEHOLDERID = eINSTANCE.getDeploy_Placeholderid();

		/**
		 * The meta object literal for the '<em><b>Updatemode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__UPDATEMODE = eINSTANCE.getDeploy_Updatemode();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__WIDTH = eINSTANCE.getDeploy_Width();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__PLATFORM = eINSTANCE.getDeploy_Platform();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__PREFERENCES = eINSTANCE.getDeploy_Preferences();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__APPLICATION = eINSTANCE.getDeploy_Application();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__PERMISSIONS = eINSTANCE.getDeploy_Permissions();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__TEMPLATE = eINSTANCE.getDeploy_Template();

		/**
		 * The meta object literal for the '<em><b>Callbacks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__CALLBACKS = eINSTANCE.getDeploy_Callbacks();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__INFO = eINSTANCE.getDeploy_Info();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__RESOURCES = eINSTANCE.getDeploy_Resources();

		/**
		 * The meta object literal for the '<em><b>Native Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__NATIVE_PACKAGE = eINSTANCE.getDeploy_NativePackage();

		/**
		 * The meta object literal for the '<em><b>Splash Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__SPLASH_IMAGE = eINSTANCE.getDeploy_SplashImage();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.JarImpl <em>Jar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.JarImpl
		 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getJar()
		 * @generated
		 */
		EClass JAR = eINSTANCE.getJar();

		/**
		 * The meta object literal for the '<em><b>Destfile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAR__DESTFILE = eINSTANCE.getJar_Destfile();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAR__PLATFORM = eINSTANCE.getJar_Platform();

		/**
		 * The meta object literal for the '<em><b>Fileset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAR__FILESET = eINSTANCE.getJar_Fileset();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAR__APPLICATION = eINSTANCE.getJar_Application();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAR__INFO = eINSTANCE.getJar_Info();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAR__RESOURCES = eINSTANCE.getJar_Resources();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl <em>Sign Jar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl
		 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getSignJar()
		 * @generated
		 */
		EClass SIGN_JAR = eINSTANCE.getSignJar();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__ALIAS = eINSTANCE.getSignJar_Alias();

		/**
		 * The meta object literal for the '<em><b>Destdir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__DESTDIR = eINSTANCE.getSignJar_Destdir();

		/**
		 * The meta object literal for the '<em><b>Keypass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__KEYPASS = eINSTANCE.getSignJar_Keypass();

		/**
		 * The meta object literal for the '<em><b>Keystore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__KEYSTORE = eINSTANCE.getSignJar_Keystore();

		/**
		 * The meta object literal for the '<em><b>Sourcejar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__SOURCEJAR = eINSTANCE.getSignJar_Sourcejar();

		/**
		 * The meta object literal for the '<em><b>Storepass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__STOREPASS = eINSTANCE.getSignJar_Storepass();

		/**
		 * The meta object literal for the '<em><b>Storetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__STORETYPE = eINSTANCE.getSignJar_Storetype();

		/**
		 * The meta object literal for the '<em><b>Fileset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGN_JAR__FILESET = eINSTANCE.getSignJar_Fileset();

	}

} //AntTasksPackage
