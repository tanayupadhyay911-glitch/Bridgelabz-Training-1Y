class VolumeOfEarth {

    public static void main(String[] args) {
        double radiusKm = 6371.0; 
        double radiusMiles = 3959.0;

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
		
		long  volumeKm3Long = (long) volumeKm3 ;
		long volumeMiles3Long = (long) volumeMiles3;
		System.out.println("The volume of earth in cubic kilometers is " +volumeKm3Long+  " and cubic miles is " +volumeMiles3Long	);

    }
}
