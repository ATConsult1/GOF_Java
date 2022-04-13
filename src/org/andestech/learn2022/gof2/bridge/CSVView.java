package org.andestech.learn2022.gof2.bridge;

public class CSVView implements IReportView{

	@Override
	public void export(String name, IData data) {
		// data logic
		System.out.println("CSV created");
		
	}
}
