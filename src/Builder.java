public class Builder {
    static class SomeClass{

        @Override
        public String toString() {
            return "SomeClass{" +
                    "n=" + n +
                    ", x=" + x +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", id=" + id +
                    '}';
        }

        int n;
        double x;
        String name;
        String description;
        int id;
        public SomeClass(int n, double x, String name, String description, int id) {
            this.n = n;
            this.x = x;
            this.name = name;
            this.description = description;
            this.id = id;
        }
    }

    static class SomeBuilder{
        public SomeBuilder() {}

        int n;
        double x;
        String name;
        String description;
        int id;

        public void setN(int n) {
            this.n = n;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setId(int id) {
            this.id = id;
        }

        public SomeClass buildSome(int n, double x, String name, String description, int id){
            return new SomeClass(n,x,name,description,id);
        }
    }
}
