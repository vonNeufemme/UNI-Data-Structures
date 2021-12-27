// jeliotJoensuu (2008) Jeliot 3 https://www.youtube.com/watch?v=t0Ka9ZUdM5k&ab_channel=jeliotJoensuu

class Song {

	String title;
	int downloadCount;
	double downloadPrice;
	
	Song(String title,
		 int downloadCount,
		 double downloadPrice) {
		 this.title = title;
		 this.downloadCount = downloadCount;
		 this.downloadPrice = downloadPrice;
	}

		
	double getSalesTotal() {
		return downloadCount * downloadPrice;
	}
	
	public static void main(String args[]) {
		Song song = new Song("Waterloo", 325, 0.9);
		double salesTotal = song.getSalesTotal();
		System.out.println(salesTotal);
	}
	
}
