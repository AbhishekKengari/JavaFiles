package Files;

public class PersonClass {
        private String Name;
        private int Age;

        public  void PersonDetails()
        {

        }
        public void PersonDetails (String Name,int Age){
            this.Name=Name;
            this.Age=Age;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

}
