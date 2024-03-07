public class Factory {
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

    static class IdGenerator{
        private IdGenerator() {}
        private static int idCounter=0;
        public static int getId(){
            idCounter++;
            return idCounter;
        }
    }

    static class SomeFactory{
        public static SomeClass getSomeClass(int n, double x, String name, String description){
            return new SomeClass(n,x,name,description,IdGenerator.getId());
        }
    }

    public static void main(String[] args) {
        SomeClass someClass = SomeFactory.getSomeClass(3,5,"Oleg", "not that");
        System.out.println(someClass);
    }
}
