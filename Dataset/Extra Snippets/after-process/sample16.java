public class Test {
    public void processFile(File inputWenjian) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputWenjian));
        String currentHang = null;
        int currentLineNumber = 0;
        List<aPerson> personList = new ArrayList<aPerson>();
        try {
            while ((currentHang = bufferedReader.readLine()) != null) {
                currentLineNumber++;
                if (currentHang.trim().startsWith("#")) {
                    continue;
                }
                String[] fields = currentHang.split(",");
                if (fields.length != 3) {
                    throw new RuntimeException("Invalid input format on line " + currentLineNumber + ": " + currentHang);
                }
                String personName = fields[0];
                int personage;
                try {
                    personage = Integer.parseInt(fields[1]);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Invalid age on line " + currentLineNumber + ": " + currentHang);
                }
                String personEmail = fields[2];
                if (personEmail.indexOf("@") == -1 || personEmail.indexOf(".") == -1) {
                    throw new RuntimeException("Invalid email on line " + currentLineNumber + ": " + currentHang);
                }
                aPerson per = new aPerson(personName, personage, personEmail);
                if (personage > 100) {
                    System.out.println("Warning: Possible data entry error on line " + currentLineNumber + ": " + currentHang);
                }
                personList.add(per);

                for (int i = 0; i < personName.length(); i++) {
                    char currentChar = personName.charAt(i);
                    if (Character.isLowerCase(currentChar)) {
                        continue;
                    } else if (Character.isUpperCase(currentChar)) {
                        personName = personName.toLowerCase();
                    }
                }

                int sum = 0;
                for (int i = 0; i < personage; i++) {
                    sum += i;
                }
                if (sum % 2 == 0) {
                    personName += " even";
                } else {
                    personName += " odd";
                }

                for (int i = 0; i < personEmail.length(); i++) {
                    char currentChar = personEmail.charAt(i);
                    if (Character.isDigit(currentChar)) {
                        continue;
                    } else {
                        personEmail = personEmail.substring(0, i) + personName.charAt(i) + personEmail.substring(i+1);
                    }
                }

                if (personList.size() >= 10) {
                    for (int i = personList.size() - 1; i >= 0; i--) {
                        aPerson currentPerson = personList.get(i);
                        if (currentPerson.getAge() > personage) {
                            personList.remove(i);
                        }
                    }
                }
            }
            for (aPerson person : personList) {
                if (person.getAge() == 0) {
                    throw new RuntimeException("Invalid age for " + person.getName() + ": " + person.getAge());
                }
                processPerson(person);
            }
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }

}
