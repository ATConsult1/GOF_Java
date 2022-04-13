package org.andestech.learn2022.gof2.bridge;

public class MReport implements IReport{

	private IReportView rv;
	private IData data;
	public MReport(IReportView rv) {this.rv=rv;}
	
	
	@Override
	public void generateReport(String name) {
	System.out.println("Monthly data ready..");
	data = new Data(); data.setPeriod(30);
	//....
	rv.export(name,data);
		
	}
}
