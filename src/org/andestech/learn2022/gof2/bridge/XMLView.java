package org.andestech.learn2022.gof2.bridge;

public class XMLView implements IReportView{

	@Override
	public void export(String name, IData data) {
		System.out.println("XML created");
		
	}
}
