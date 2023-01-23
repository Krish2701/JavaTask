package org.phone;

public class Main {
	
	public static void main(String[] args) {
		ExternalStorage ext = new ExternalStorage();
		InternalStorage inte = new InternalStorage(); 
		ext.setPhoneName("Apple");
		ext.setSize(64);
		inte.setProcessorName("QuadCore");
		inte.setRamsize("4GB");
		System.out.println("Name:"+ext.getPhoneName()+"\n"+"Size:"+ext.getSize()+"\n"+"ProcessorName:"+inte.getProcessorName()+"\n"+"RamSize:"+inte.getRamsize());
		
	}

}
