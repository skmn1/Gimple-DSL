package fr.ensma.generator;


import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;

public interface IGimpleGenerator extends IGenerator2{
    public void doGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context);
}