package ua.lviv.iot.firstLab;

public class Airplane {

	public static final int CURRENT_FLIGHT_RANGE = 10000;

	private String name;

	private float fuelTankCapacity;

	private int numberOfPassengers;

	private float weight;

	private float cruisingSpeed;

	protected int numberOfEngines;

	protected float wingArea;

	public Airplane(String name, float fuelTankCapacity, int numberOfPassengers, float weight, float cruisingSpeed,
			int numberOfEngines, float wingArea) {
		this.name = name;
		this.fuelTankCapacity = fuelTankCapacity;
		this.numberOfPassengers = numberOfPassengers;
		this.weight = weight;
		this.cruisingSpeed = cruisingSpeed;
		this.numberOfEngines = numberOfEngines;
		this.wingArea = wingArea;
	}

	public Airplane(String name, float fuelTankCapacity, int numberOfPassengers, float weight) {
		this(name, fuelTankCapacity, numberOfPassengers, weight, 0, 0, 0);
	}

	public Airplane() {
		this(null, 0, 0, 0, 0, 0, 0);
	}

	static void printStaticCURRENT_FLIGHT_RANGE() {
		System.out.println("\tДальнiсть поточного рейсу: " + CURRENT_FLIGHT_RANGE + " км.");
	}

	void printName() {
		System.out.println("\tНазва: " + this.getName());
	}

	void prinFuelTankCapacity() {
		System.out.println("\tОбсяг паливних бакiв: " + this.getFuelTankCapacity() + " л.");
	}

	void printNumberOfPassengers() {
		System.out.println("\tКiлькiсть пасажирiв на борту : " + this.getNumberOfPassengers());
	}

	void printWeight() {
		System.out.println("\tВага лiтака: " + this.getWeight() + " кг.");
	}

	void printCruisingSpeed() {
		System.out.println("\tКрейсерська швидкiсть: " + this.getCruisingSpeed() + " км/год.");
	}

	void printNumberOfEngines() {
		System.out.println("\tКiлькiсть двигунiв: " + this.getNumberOfEngines());
	}

	void printWingArea() {
		System.out.println("\tПлоща крила: " + this.getWingArea() + " м\u00B2.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFuelTankCapacity() {
		return fuelTankCapacity;
	}

	public void setFuelTankCapacity(float fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getCruisingSpeed() {
		return cruisingSpeed;
	}

	public void setCruisingSpeed(float cruisingSpeed) {
		this.cruisingSpeed = cruisingSpeed;
	}

	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

	public float getWingArea() {
		return wingArea;
	}

	public void setWingArea(float wingArea) {
		this.wingArea = wingArea;
	}

	public String toString() {
		return "\n ======================================================"
				+ "\n ====================== Airplane ====================== " + "\n Name = " + name
				+ "\n Fuel tank capacity = " + fuelTankCapacity + "\n Number of passengers = " + numberOfPassengers
				+ "\n Weight = " + weight + "\n Cruising Speed = " + cruisingSpeed + "\n Number of engines = "
				+ numberOfEngines + "\n Wing area = " + wingArea
				+ "\n ======================================================";
	}
}
