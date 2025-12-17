/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package ProjectStructureM2T.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.generation.strategy.IAcceleoGenerationStrategy;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

import projectStructureMM.ProjectStructure;

/**
 * Entry point of the 'Generate' generation module.
 *
 * @generated
 */
public class Generate extends AbstractAcceleoGenerator {
	/**
	 * The name of the module.
	 *
	 * @generated
	 */
	public static final String MODULE_FILE_NAME = "/ProjectStructureM2T/main/generate";

	/**
	 * The name of the templates that are to be generated.
	 *
	 * @generated
	 */
	public static final String[] TEMPLATE_NAMES = { "generateProject" };

	/**
	 * The list of properties files from the launch parameters (Launch
	 * configuration).
	 *
	 * @generated
	 */
	private List<String> propertiesFiles = new ArrayList<String>();

	/**
	 * Allows the public constructor to be used. Note that a generator created this
	 * way cannot be used to launch generations before one of
	 * {@link #initialize(EObject, File, List)} or
	 * {@link #initialize(URI, File, List)} is called.
	 * <p>
	 * The main reason for this constructor is to allow clients of this generation
	 * to call it from another Java file, as it allows for the retrieval of
	 * {@link #getProperties()} and {@link #getGenerationListeners()}.
	 * </p>
	 *
	 * @generated
	 */
	public Generate() {
        // Empty implementation
    }

	/**
	 * This allows clients to instantiates a generator with all required
	 * information.
	 * 
	 * @param modelURI     URI where the model on which this generator will be used
	 *                     is located.
	 * @param targetFolder This will be used as the output folder for this
	 *                     generation : it will be the base path against which all
	 *                     file block URLs will be resolved.
	 * @param arguments    If the template which will be called requires more than
	 *                     one argument taken from the model, pass them here.
	 * @throws IOException This can be thrown in three scenarios : the module cannot
	 *                     be found, it cannot be loaded, or the model cannot be
	 *                     loaded.
	 * @generated
	 */
	public Generate(URI modelURI, File targetFolder, List<? extends Object> arguments) throws IOException {
        initialize(modelURI, targetFolder, arguments);
    }

	/**
	 * This allows clients to instantiates a generator with all required
	 * information.
	 * 
	 * @param model        We'll iterate over the content of this element to find
	 *                     Objects matching the first parameter of the template we
	 *                     need to call.
	 * @param targetFolder This will be used as the output folder for this
	 *                     generation : it will be the base path against which all
	 *                     file block URLs will be resolved.
	 * @param arguments    If the template which will be called requires more than
	 *                     one argument taken from the model, pass them here.
	 * @throws IOException This can be thrown in two scenarios : the module cannot
	 *                     be found, or it cannot be loaded.
	 * @generated
	 */
	public Generate(EObject model, File targetFolder, List<? extends Object> arguments) throws IOException {
        initialize(model, targetFolder, arguments);
    }

	/**
	 * This can be used to launch the generation from a standalone application.
	 * 
	 * @param args Arguments of the generation.
	 * @generated NOT
	 */
	public static void main(String[] args) {
		try {
			projectStructureMM.ProjectStructureMMPackage.eINSTANCE.eClass();

			// URI modelURI = URI.createFileURI("ProjectStructureModel.xmi");
			// Generate generator = new Generate(modelURI, new File("output/"), new
			// ArrayList<String>());
			// generator.doGenerate(new BasicMonitor());

			if (args.length < 2) {
				System.out.println("Arguments not valid : {model, folder}.");
			} else {
				URI modelURI = URI.createFileURI(args[0]);
				File folder = new File(args[1]);

				List<String> arguments = new ArrayList<String>();

				/*
				 * If you want to change the content of this method, do NOT forget to change the
				 * "@generated" tag in the Javadoc of this method to "@generated NOT". Without
				 * this new tag, any compilation of the Acceleo module with the main template
				 * that has caused the creation of this class will revert your modifications.
				 */

				/*
				 * Add in this list all the arguments used by the starting point of the
				 * generation If your main template is called on an element of your model and a
				 * String, you can add in "arguments" this "String" attribute.
				 */

				Generate generator = new Generate(modelURI, folder, arguments);

				/*
				 * Add the properties from the launch arguments. If you want to programmatically
				 * add new properties, add them in "propertiesFiles" You can add the absolute
				 * path of a properties files, or even a project relative path. If you want to
				 * add another "protocol" for your properties files, please override
				 * "getPropertiesLoaderService(AcceleoService)" in order to return a new
				 * property loader. The behavior of the properties loader service is explained
				 * in the Acceleo documentation (Help -> Help Contents).
				 */

				for (int i = 2; i < args.length; i++) {
					generator.addPropertiesFile(args[i]);
				}

				generator.doGenerate(new BasicMonitor());
			}
		} catch (

		IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Launches the generation described by this instance.
	 * 
	 * @param monitor This will be used to display progress information to the user.
	 * @throws IOException This will be thrown if any of the output files cannot be
	 *                     saved to disk.
	 * @generated NOT
	 */
	@Override
	public void doGenerate(Monitor monitor) throws IOException {
        /*
         * TODO if you wish to change the generation as a whole, override this. The default behavior should
         * be sufficient in most cases. If you want to change the content of this method, do NOT forget to
         * change the "@generated" tag in the Javadoc of this method to "@generated NOT". Without this new tag,
         * any compilation of the Acceleo module with the main template that has caused the creation of this
         * class will revert your modifications. If you encounter a problem with an unresolved proxy during the
         * generation, you can remove the comments in the following instructions to check for problems. Please
         * note that those instructions may have a significant impact on the performances.
         */

        //org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(model);

        /*
         * If you want to check for potential errors in your models before the launch of the generation, you
         * use the code below.
         */

        //if (model != null && model.eResource() != null) {
        //    List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> errors = model.eResource().getErrors();
        //    for (org.eclipse.emf.ecore.resource.Resource.Diagnostic diagnostic : errors) {
        //        System.err.println(diagnostic.toString());
        //    }
        //}

        // Call the parent implementation to generate files from templates
        super.doGenerate(monitor);
        
        // Generate additional files in M2T (Docker, .dockerignore, server.py)
        generateDockerFiles();
    }

	/**
	 * If this generator needs to listen to text generation events, listeners can be
	 * returned from here.
	 * 
	 * @return List of listeners that are to be notified when text is generated
	 *         through this launch.
	 * @generated
	 */
	@Override
	public List<IAcceleoTextGenerationListener> getGenerationListeners() {
        List<IAcceleoTextGenerationListener> listeners = super.getGenerationListeners();
        /*
         * TODO if you need to listen to generation event, add listeners to the list here. If you want to change
         * the content of this method, do NOT forget to change the "@generated" tag in the Javadoc of this method
         * to "@generated NOT". Without this new tag, any compilation of the Acceleo module with the main template
         * that has caused the creation of this class will revert your modifications.
         */
        return listeners;
    }

	/**
	 * If you need to change the way files are generated, this is your entry point.
	 * <p>
	 * The default is
	 * {@link org.eclipse.acceleo.engine.generation.strategy.DefaultStrategy}; it
	 * generates files on the fly. If you only need to preview the results, return a
	 * new {@link org.eclipse.acceleo.engine.generation.strategy.PreviewStrategy}.
	 * Both of these aren't aware of the running Eclipse and can be used standalone.
	 * </p>
	 * <p>
	 * If you need the file generation to be aware of the workspace (A typical
	 * example is when you wanna override files that are under clear case or any
	 * other VCS that could forbid the overriding), then return a new
	 * {@link org.eclipse.acceleo.engine.generation.strategy.WorkspaceAwareStrategy}.
	 * <b>Note</b>, however, that this <b>cannot</b> be used standalone.
	 * </p>
	 * <p>
	 * All three of these default strategies support merging through JMerge.
	 * </p>
	 * 
	 * @return The generation strategy that is to be used for generations launched
	 *         through this launcher.
	 * @generated
	 */
	@Override
	public IAcceleoGenerationStrategy getGenerationStrategy() {
        return super.getGenerationStrategy();
    }

	/**
	 * This will be called in order to find and load the module that will be
	 * launched through this launcher. We expect this name not to contain file
	 * extension, and the module to be located beside the launcher.
	 * 
	 * @return The name of the module that is to be launched.
	 * @generated
	 */
	@Override
	public String getModuleName() {
        return MODULE_FILE_NAME;
    }

	/**
	 * If the module(s) called by this launcher require properties files, return
	 * their qualified path from here.Take note that the first added properties
	 * files will take precedence over subsequent ones if they contain conflicting
	 * keys.
	 * 
	 * @return The list of properties file we need to add to the generation context.
	 * @see java.util.ResourceBundle#getBundle(String)
	 * @generated
	 */
	@Override
	public List<String> getProperties() {
        /*
         * If you want to change the content of this method, do NOT forget to change the "@generated"
         * tag in the Javadoc of this method to "@generated NOT". Without this new tag, any compilation
         * of the Acceleo module with the main template that has caused the creation of this class will
         * revert your modifications.
         */

        /*
         * TODO if your generation module requires access to properties files, add their qualified path to the list here.
         * 
         * Properties files can be located in an Eclipse plug-in or in the file system (all Acceleo projects are Eclipse
         * plug-in). In order to use properties files located in an Eclipse plugin, you need to add the path of the properties
         * files to the "propertiesFiles" list:
         * 
         * final String prefix = "platform:/plugin/";
         * final String pluginName = "org.eclipse.acceleo.module.sample";
         * final String packagePath = "/org/eclipse/acceleo/module/sample/properties/";
         * final String fileName = "default.properties";
         * propertiesFiles.add(prefix + pluginName + packagePath + fileName);
         * 
         * With this mechanism, you can load properties files from your plugin or from another plugin.
         * 
         * You may want to load properties files from the file system, for that you need to add the absolute path of the file:
         * 
         * propertiesFiles.add("C:\Users\MyName\MyFile.properties");
         * 
         * If you want to let your users add properties files located in the same folder as the model:
         *
         * if (EMFPlugin.IS_ECLIPSE_RUNNING && model != null && model.eResource() != null) { 
         *     propertiesFiles.addAll(AcceleoEngineUtils.getPropertiesFilesNearModel(model.eResource()));
         * }
         * 
         * To learn more about Properties Files, have a look at the Acceleo documentation (Help -> Help Contents).
         */
        return propertiesFiles;
    }

	/**
	 * Adds a properties file in the list of properties files.
	 * 
	 * @param propertiesFile The properties file to add.
	 * @generated
	 * @since 3.1
	 */
	@Override
	public void addPropertiesFile(String propertiesFile) {
        this.propertiesFiles.add(propertiesFile);
    }

	/**
	 * This will be used to get the list of templates that are to be launched by
	 * this launcher.
	 * 
	 * @return The list of templates to call on the module {@link #getModuleName()}.
	 * @generated
	 */
	@Override
	public String[] getTemplateNames() {
        return TEMPLATE_NAMES;
    }

	/**
	 * This can be used to update the resource set's package registry with all
	 * needed EPackages.
	 * 
	 * @param resourceSet The resource set which registry has to be updated.
	 * @generated
	 */
	@Override
	public void registerPackages(ResourceSet resourceSet) {
        super.registerPackages(resourceSet);
        
        /*
         * If you want to change the content of this method, do NOT forget to change the "@generated"
         * tag in the Javadoc of this method to "@generated NOT". Without this new tag, any compilation
         * of the Acceleo module with the main template that has caused the creation of this class will
         * revert your modifications.
         */
        
        /*
         * If you need additional package registrations, you can register them here. The following line
         * (in comment) is an example of the package registration for UML.
         * 
         * You can use the method  "isInWorkspace(Class c)" to check if the package that you are about to
         * register is in the workspace.
         * 
         * To register a package properly, please follow the following conventions:
         *
         * If the package is located in another plug-in, already installed in Eclipse. The following content should
         * have been generated at the beginning of this method. Do not register the package using this mechanism if
         * the metamodel is located in the workspace.
         *  
         * if (!isInWorkspace(UMLPackage.class)) {
         *     // The normal package registration if your metamodel is in a plugin.
         *     resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
         * }
         * 
         * If the package is located in another project in your workspace, the plugin containing the package has not
         * been register by EMF and Acceleo should register it automatically. If you want to use the generator in
         * stand alone, the regular registration (seen a couple lines before) is needed.
         * 
         * To learn more about Package Registration, have a look at the Acceleo documentation (Help -> Help Contents).
         */
    }

	/**
	 * This can be used to update the resource set's resource factory registry with
	 * all needed factories.
	 * 
	 * @param resourceSet The resource set which registry has to be updated.
	 * @generated
	 */
	@Override
	public void registerResourceFactories(ResourceSet resourceSet) {
        super.registerResourceFactories(resourceSet);
        /*
         * If you want to change the content of this method, do NOT forget to change the "@generated"
         * tag in the Javadoc of this method to "@generated NOT". Without this new tag, any compilation
         * of the Acceleo module with the main template that has caused the creation of this class will
         * revert your modifications.
         */
        
        /*
         * TODO If you need additional resource factories registrations, you can register them here. the following line
         * (in comment) is an example of the resource factory registration.
         *
         * If you want to use the generator in stand alone, the resource factory registration will be required.
         *  
         * To learn more about the registration of Resource Factories, have a look at the Acceleo documentation (Help -> Help Contents). 
         */ 
        
        // resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(XyzResource.FILE_EXTENSION, XyzResource.Factory.INSTANCE);
        
        /*
         * Some metamodels require a very complex setup for standalone usage. For example, if you want to use a generator
         * targetting UML models in standalone, you NEED to use the following:
         */ 
        // UMLResourcesUtil.init(resourceSet)
    }

	/**
	 * Generate Docker-related files (Dockerfile, .dockerignore) and server.py in the M2T phase.
	 * These files are now generated directly in Java instead of through QVTO transformations.
	 * 
	 * @throws IOException if file writing fails
	 */
	private void generateDockerFiles() throws IOException {
		// Get the project structure from the model
		if (model == null || !(model instanceof ProjectStructure)) {
			return;
		}
		
		ProjectStructure project = (ProjectStructure) model;
		String projectName = project.getName();
		
		// Determine the base path for file generation
		File baseDir = targetFolder;
		File projectDir = new File(baseDir, projectName);
		
		// Generate Dockerfile
		generateDockerfile(projectDir);
		
		// Generate .dockerignore
		generateDockerignore(projectDir);
		
		// Generate server.py
		generateServerPy(projectDir);
	}

	/**
	 * Generate Dockerfile with Python 3.13-slim base image
	 */
	private void generateDockerfile(File projectDir) throws IOException {
		File dockerfile = new File(projectDir, "Dockerfile");
		try (FileWriter writer = new FileWriter(dockerfile)) {
			writer.write("FROM python:3.13-slim\n");
			writer.write("\n");
			writer.write("WORKDIR /app\n");
			writer.write("\n");
			writer.write("# Copy requirements first (for better caching)\n");
			writer.write("COPY requirements.txt .\n");
			writer.write("\n");
			writer.write("# Set up virtual environment and install dependencies\n");
			writer.write("RUN python -m venv /opt/venv\n");
			writer.write("ENV PATH=\"/opt/venv/bin:$PATH\"\n");
			writer.write("\n");
			writer.write("# Install dependencies\n");
			writer.write("RUN pip install --upgrade pip && \\\n");
			writer.write("    pip install -r requirements.txt\n");
			writer.write("\n");
			writer.write("# Copy project files\n");
			writer.write("COPY src/ ./src/\n");
			writer.write("COPY data/ ./data/\n");
			writer.write("COPY models/ ./models/\n");
			writer.write("COPY outputs/ ./outputs/\n");
			writer.write("\n");
			writer.write("# Expose the port for prediction service\n");
			writer.write("EXPOSE 8080\n");
			writer.write("\n");
			writer.write("# Run the server\n");
			writer.write("CMD [\"python\", \"src/server.py\"]\n");
		}
	}

	/**
	 * Generate .dockerignore file
	 */
	private void generateDockerignore(File projectDir) throws IOException {
		File dockerignore = new File(projectDir, ".dockerignore");
		try (FileWriter writer = new FileWriter(dockerignore)) {
			writer.write("__pycache__\n");
			writer.write("*.pyc\n");
			writer.write(".git\n");
			writer.write(".env\n");
		}
	}

	/**
	 * Generate server.py with Flask-based prediction service
	 */
	private void generateServerPy(File projectDir) throws IOException {
		File srcDir = new File(projectDir, "src");
		if (!srcDir.exists()) {
			srcDir.mkdirs();
		}
		
		File serverPy = new File(srcDir, "server.py");
		try (FileWriter writer = new FileWriter(serverPy)) {
			writer.write("\"\"\"\n");
			writer.write("Prediction service - Flask based API for model prediction\n");
			writer.write("Accessible at localhost:8080/predict\n");
			writer.write("\"\"\"\n");
			writer.write("\n");
			writer.write("from flask import Flask, request, jsonify\n");
			writer.write("import joblib\n");
			writer.write("import numpy as np\n");
			writer.write("import os\n");
			writer.write("\n");
			writer.write("app = Flask(__name__)\n");
			writer.write("\n");
			writer.write("# Load models and scalers at start\n");
			writer.write("MODEL_PATH = os.path.join(os.path.dirname(__file__), \"..\", \"models\")\n");
			writer.write("model = None\n");
			writer.write("scaler = None\n");
			writer.write("feature_names = None\n");
			writer.write("is_keras_model = False\n");
			writer.write("\n");
			writer.write("def load_models():\n");
			writer.write("    \"\"\"Load the trained model and associated artifacts.\"\"\"\n");
			writer.write("    global model, scaler, feature_names, is_keras_model\n");
			writer.write("    try:\n");
			writer.write("        model_files = [f for f in os.listdir(MODEL_PATH) if f.endswith(\".pkl\") or f.endswith(\".keras\") or f.endswith(\".h5\")]\n");
			writer.write("        # Prioritize Keras and h5 models over pkl\n");
			writer.write("        keras_models = [f for f in model_files if f.endswith(\".keras\") or f.endswith(\".h5\")]\n");
			writer.write("        pkl_files = [f for f in model_files if f.endswith(\".pkl\")]\n");
			writer.write("        \n");
			writer.write("        for f in keras_models:\n");
			writer.write("            if model is None:\n");
			writer.write("                filepath = os.path.join(MODEL_PATH, f)\n");
			writer.write("                try:\n");
			writer.write("                    from tensorflow import keras\n");
			writer.write("                    model = keras.models.load_model(filepath)\n");
			writer.write("                    is_keras_model = True\n");
			writer.write("                    print(f\"Loaded Keras model from {f}\")\n");
			writer.write("                except ImportError:\n");
			writer.write("                    print(\"TensorFlow not available for loading .keras/.h5 model\")\n");
			writer.write("        \n");
			writer.write("        for f in pkl_files:\n");
			writer.write("            filepath = os.path.join(MODEL_PATH, f)\n");
			writer.write("            if model is None and \"model\" in f.lower() and \"scaler\" not in f.lower():\n");
			writer.write("                model = joblib.load(filepath)\n");
			writer.write("                print(f\"Loaded model from {f}\")\n");
			writer.write("            elif \"scaler\" in f.lower():\n");
			writer.write("                scaler = joblib.load(filepath)\n");
			writer.write("                print(f\"Loaded scaler from {f}\")\n");
			writer.write("            elif \"feature_names\" in f.lower():\n");
			writer.write("                feature_names = joblib.load(filepath)\n");
			writer.write("                print(f\"Loaded feature names from {f}\")\n");
			writer.write("        \n");
			writer.write("        if model is not None:\n");
			writer.write("            print(\"Model loaded successfully\")\n");
			writer.write("        else:\n");
			writer.write("            print(\"Warning: No model found in models directory\")\n");
			writer.write("    \n");
			writer.write("    except Exception as e:\n");
			writer.write("        print(f\"Error loading model: {e}\")\n");
			writer.write("\n");
			writer.write("@app.route(\"/health\", methods=[\"GET\"])\n");
			writer.write("def health():\n");
			writer.write("    \"\"\"Health check endpoint\"\"\"\n");
			writer.write("    return jsonify({\n");
			writer.write("        \"status\": \"healthy\",\n");
			writer.write("        \"model_loaded\": model is not None\n");
			writer.write("    })\n");
			writer.write("\n");
			writer.write("@app.route(\"/predict\", methods=[\"POST\"])\n");
			writer.write("def predict():\n");
			writer.write("    \"\"\"\n");
			writer.write("    Prediction endpoint\n");
			writer.write("    Expects JSON input with features for prediction.\n");
			writer.write("    Returns JSON with prediction results\n");
			writer.write("    \n");
			writer.write("    Example input:\n");
			writer.write("    {\n");
			writer.write("        \"features\": [[1.0, 2.0, 3.0, 4.0]]\n");
			writer.write("    }\n");
			writer.write("    \"\"\"\n");
			writer.write("    try:\n");
			writer.write("        if model is None:\n");
			writer.write("            return jsonify({\"error\": \"Model not loaded\"}), 500\n");
			writer.write("        \n");
			writer.write("        data = request.get_json()\n");
			writer.write("        if data is None:\n");
			writer.write("            return jsonify({\"error\": \"No JSON data provided\"}), 400\n");
			writer.write("        \n");
			writer.write("        features = data.get(\"features\")\n");
			writer.write("        if features is None:\n");
			writer.write("            return jsonify({\"error\": \"No features provided\"}), 400\n");
			writer.write("        \n");
			writer.write("        # Convert to numpy array\n");
			writer.write("        features_array = np.array(features)\n");
			writer.write("        \n");
			writer.write("        # Apply scaling if scaler is available\n");
			writer.write("        if scaler is not None:\n");
			writer.write("            features_array = scaler.transform(features_array)\n");
			writer.write("        \n");
			writer.write("        # Make prediction\n");
			writer.write("        if is_keras_model:\n");
			writer.write("            predictions = model.predict(features_array)\n");
			writer.write("            predictions = predictions.tolist()\n");
			writer.write("        else:\n");
			writer.write("            predictions = model.predict(features_array)\n");
			writer.write("            predictions = predictions.tolist()\n");
			writer.write("        \n");
			writer.write("        # Get prediction probabilities if available\n");
			writer.write("        try:\n");
			writer.write("            if hasattr(model, 'predict_proba'):\n");
			writer.write("                probabilities = model.predict_proba(features_array)\n");
			writer.write("                return jsonify({\n");
			writer.write("                    \"predictions\": predictions,\n");
			writer.write("                    \"probabilities\": probabilities.tolist()\n");
			writer.write("                })\n");
			writer.write("        except:\n");
			writer.write("            pass\n");
			writer.write("        \n");
			writer.write("        return jsonify({\"predictions\": predictions})\n");
			writer.write("    \n");
			writer.write("    except Exception as e:\n");
			writer.write("        return jsonify({\"error\": str(e)}), 500\n");
			writer.write("\n");
			writer.write("if __name__ == \"__main__\":\n");
			writer.write("    load_models()\n");
			writer.write("    app.run(host=\"0.0.0.0\", port=8080, debug=False)\n");
		}
	}

}
