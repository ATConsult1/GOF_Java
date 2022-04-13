package org.andestech.learn2022.gof2.bridge;

public class CheckBridge {

	
	private static void report(IReport r)
	{
		r.generateReport("file1");
	}
	
	public static void main(String[] args) {
		
		report(new WReport(new PDFView()));
		report(new MReport(new XMLView()));
		report(new MReport(new CSVView()));
		
	}
	
}
