package lib.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class TestNGListener implements IAnnotationTransformer,IRetryAnalyzer{
	int maxcount=1;
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(this.getClass());
		if(testMethod.getName().equals("createLead"))
		{
			annotation.setInvocationCount(1);
			annotation.setTimeOut(80000);
		}
		/*if(testMethod.getName().equals("delete"))
		{
			annotation.setEnabled(false);
		}*/
		if(testMethod.getName().equals("deletelead"))
		{
			annotation.setInvocationCount(1);
			annotation.setTimeOut(80000);
		}
		if(testMethod.getName().equals("duplicatelead"))
		{
			annotation.setInvocationCount(1);
			annotation.setTimeOut(80000);
		}
		if(testMethod.getName().equals("editlead"))
		{
			annotation.setInvocationCount(1);
			annotation.setTimeOut(80000);
		}
		if(testMethod.getName().equals("mergelead"))
		{
			annotation.setInvocationCount(2);
			annotation.setTimeOut(90000);
		}
	}

	
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()& maxcount<2)
		{
			maxcount++;
		return true;
		}
		return false;
	}
	
	

}
