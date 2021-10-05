package models;

import java.time.LocalDate;

public class Order{
    
    private String idEngine;
	private String workshop;
	private String ownerName;
	private String ownerPhone;
	private LocalDate arriveDate;
    private String[] engineParts;
    private boolean isRepaired = false;
    private boolean isDelivered = false;
    private boolean isPayed = false;
    private Jobs[] jobsList;
	
	public Order(String idEngine, String workshop, String ownerName, String ownerPhone, LocalDate arriveDate,
			String engineName, String[] engineParts, boolean isRepaired, boolean isDelivered, boolean isPayed,
			Jobs[] jobsList) {
		this.idEngine = idEngine;
		this.workshop = workshop;
		this.ownerName = ownerName;
		this.ownerPhone = ownerPhone;
		this.arriveDate = arriveDate;
		this.engineParts = engineParts;
		this.isRepaired = isRepaired;
		this.isDelivered = isDelivered;
		this.isPayed = isPayed;
		this.jobsList = jobsList;
	}

    public Order(){

    }

	public String getIdEngine() {
		return idEngine;
	}

	public void setIdEngine(String idEngine) {
		this.idEngine = idEngine;
	}

	public String getWorkshop() {
		return workshop;
	}

	public void setWorkshop(String workshop) {
		this.workshop = workshop;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}
	
	public LocalDate getArriveDate() {
		return arriveDate;
	}

	public void setarriveDate(LocalDate arriveDate) {
		this.arriveDate = arriveDate;
	}

	public String[] getEngineParts() {
		return engineParts;
	}

	public void setEngineParts(String[] engineParts) {
		this.engineParts = engineParts;
	}

	public boolean isRepaired() {
		return isRepaired;
	}

	public void setRepaired(boolean isRepaired) {
		this.isRepaired = isRepaired;
	}

	public boolean isDelivered() {
		return isDelivered;
	}

	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}

	public boolean isPayed() {
		return isPayed;
	}

	public void setPayed(boolean isPayed) {
		this.isPayed = isPayed;
	}

    public void addJob(Jobs job){
        Jobs[] temp = new Jobs[jobsList.length+1];
		for (int i = 0; i < jobsList.length; i++) {
			temp[i] = jobsList[i];
		}
		temp[jobsList.length] = job;
		jobsList = temp;
    }

	public void addComponent(String component) {
		String[] temp = new String[engineParts.length+1];
		for (int i = 0; i < engineParts.length; i++) {
			temp[i] = engineParts[i];
		}
		temp[engineParts.length] = component;
		engineParts = temp;
	}

	public void deleteComponent(String component) {
		String[] temp = new String[engineParts.length-1];
		for (int i = 0, j = 0 ; i < engineParts.length; i++) {
			if(engineParts[i].compareTo(component)!=0) {
				temp[j] = engineParts[i];
				j++;
			}
		}
		engineParts = temp;
	}

	public void setRepaired(String engineId) {
		this.isRepaired = true;
	}
	
	public void setPayed(String engineId) {
		this.isPayed = true;
	}
	
	public void setDelivered(String engineId) {
		this.isDelivered = true;
	}
}
