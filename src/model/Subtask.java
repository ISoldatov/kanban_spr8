package model;

public class Subtask extends Task {

    private final int epicId;

    public Subtask(Integer id, String name, String description, StatusType status, int epicId) {
        super(id, name, description, status);
        this.epicId = epicId;
    }

    public int getEpicId() {
        return epicId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Subtask subtask = (Subtask) o;

        return epicId == subtask.epicId;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + epicId;
        return result;
    }

    @Override
    public String toString() {
        String result= super.toString();
        result=super.toString().substring(0,result.length()-1);
        return result+", epicId=" + epicId + '}';
    }
}
