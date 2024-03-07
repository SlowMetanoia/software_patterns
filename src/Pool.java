import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class Pool {

    static class SomePool{

        static class SomeClass{
            private static int idCounter = 0;
            int id;

            @Override
            public String toString() {
                return "SomeClass{" +
                        "id=" + id +
                        '}';
            }

            public SomeClass() {
                idCounter++;
                this.id = idCounter;
            }
        }

        Set<SomeClass> free = new HashSet<SomeClass>();
        Set<SomeClass> taken = new HashSet<SomeClass>();;

        public SomePool(int size) {
            for (int i = 0; i < size; i++) {
                free.add(new SomeClass());
            }
        }

        boolean isAnyFree(){
            return free.isEmpty();
        }

        SomeClass take() throws Exception {
            if(!free.isEmpty()){
                SomeClass el = free.iterator().next();
                free.remove(el);
                taken.add(el);
                return el;
            } else throw new IndexOutOfBoundsException("Attempt to take from empty pool");
        }
        void put(SomeClass el){
            if(taken.contains(el)){
                taken.remove(el);
                free.add(el);
            } else throw new NoSuchElementException("No such element has been taken");
        }
    }

    public static void main(String[] args) throws Exception {
        SomePool pool = new SomePool(4);
        SomePool.SomeClass obj1 = pool.take();
        SomePool.SomeClass obj2 = pool.take();
        SomePool.SomeClass obj3 = pool.take();
        SomePool.SomeClass obj4 = pool.take();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);

        pool.put(obj4);

        SomePool.SomeClass obj5 = pool.take();

        System.out.println(obj5);
    }
}
