class FlashCard {
    private String question;
    private String answer;
    private Category category;

    public FlashCard(String question, String answer, Category category) {
        this.question = question;
        this.answer = answer;
        this.category = category;
    }


    
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public Category getCategory() {
        return category;
    }

    public void displayQuestion() {
        System.out.println("Question: " + question);
    }

    public void checkAnswer(String userAnswer) {
        if (userAnswer.equalsIgnoreCase(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is: " + answer);
        }
    }

    public void displayCategoryInfo() {
        System.out.println("Category: " + category.getName());
        System.out.println("Description: " + category.getDescription());
    }
}

class Category {
    private String name;
    private String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

public class Main {
    public static void main(String[] args) {
        Category geography = new Category("Geography", "The study of Earth's landscapes, environments, and the people who live in them.");
        FlashCard card1 = new FlashCard("What is the capital of France?", "Paris", geography);
        
        System.out.println("Welcome to the Flashcard Program!");
        System.out.println("===============================");
        System.out.println("Here is your question:");
        card1.displayQuestion();
        
        System.out.println("\nPlease enter your answer:");
        // For simplicity, assume user input is "Paris"
        String userAnswer = "Paris";
        System.out.println("Your answer: " + userAnswer);
        
        System.out.println("\nChecking your answer...");
        card1.checkAnswer(userAnswer);
        
        System.out.println("\nCategory Information:");
        card1.displayCategoryInfo();
    }
}
