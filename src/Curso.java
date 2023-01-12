public class Curso {
    private String name;
    private Integer duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration + " horas";
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
