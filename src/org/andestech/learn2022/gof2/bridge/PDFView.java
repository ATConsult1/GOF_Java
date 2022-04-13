package org.andestech.learn2022.gof2.bridge;

public class PDFView implements IReportView{

	@Override
	public void export(String name, IData data) {
		System.out.println("PDF created");
		
	}

}
