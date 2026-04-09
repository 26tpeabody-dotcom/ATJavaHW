public class BaseballCard {
    String name; 
    int year; 

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "BaseballCard[name=" + name + ", year=" + year + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (!(obj instanceof BaseballCard)) 
            return false;
        else {
            BaseballCard otherBaseballCard = (BaseballCard) obj;
            return year == otherBaseballCard.year && name.equals(otherBaseballCard.name);
        }
    }
}