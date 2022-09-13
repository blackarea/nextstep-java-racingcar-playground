package afterFeedback;


import java.util.Objects;

public class Name {
    private String name;

    public Name(String name) {
        if(name.isEmpty() || name.trim().isEmpty()){
            throw new IllegalArgumentException("자동차 이름이 있어야 합니다.");
        }
        if(name.length() > 4){
            throw new IllegalArgumentException("자동차 이름은 4글자를 넘어서면 안됩니다.");
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
