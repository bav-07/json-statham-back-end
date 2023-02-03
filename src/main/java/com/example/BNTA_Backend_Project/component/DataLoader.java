package com.example.BNTA_Backend_Project.component;

import com.example.BNTA_Backend_Project.models.Movie;
import com.example.BNTA_Backend_Project.models.Review;
import com.example.BNTA_Backend_Project.models.User;
import com.example.BNTA_Backend_Project.repositories.MovieRepository;
import com.example.BNTA_Backend_Project.repositories.ReviewRepository;
import com.example.BNTA_Backend_Project.repositories.UserRepository;
import com.example.BNTA_Backend_Project.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    ReviewService reviewService;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        Users
        User user1 = new User("Sara");
        userRepository.save(user1);

        User user2 = new User("Radhika");
        userRepository.save(user2);

        User user3 = new User("Isabel");
        userRepository.save(user3);

        User user4 = new User("Saad");
        userRepository.save(user4);

        User user5 = new User("John");
        userRepository.save(user5);

        User user6 = new User("Losh");
        userRepository.save(user6);

        User user7 = new User("Salma");
        userRepository.save(user7);

        User user8 = new User("Bav");
        userRepository.save(user8);

        User user9 = new User("Harry");
        userRepository.save(user9);

        User user10 = new User("Iain");
        userRepository.save(user10);

//        Movies
        Movie movie1 = new Movie("Alien", "sci-fi", 117, 1979);
        movieRepository.save(movie1);

        Movie movie2 = new Movie("The Imitation Game", "adventure", 114, 2014);
        movieRepository.save(movie2);

        Movie movie3 = new Movie("Iron Man", "adventure", 126, 2008);
        movieRepository.save(movie3);

        Movie movie4 = new Movie("The Martian", "adventure", 144, 2015);
        movieRepository.save(movie4);

        Movie movie5 = new Movie("Braveheart", "adventure", 150, 1995);
        movieRepository.save(movie5);

        Movie movie6 = new Movie("Titanic", "romance", 196, 1997);
        movieRepository.save(movie6);

        Movie movie7 = new Movie("Black Panther", "adventure", 134, 2018);
        movieRepository.save(movie7);

        Movie movie8 = new Movie("Skyfall", "adventure", 143, 2012);
        movieRepository.save(movie8);

        Movie movie9 = new Movie("Aquaman", "adventure", 143, 2018);
        movieRepository.save(movie9);

        Movie movie10 = new Movie("Iron Man 2", "adventure", 150, 2010);
        movieRepository.save(movie10);

        Movie movie11 = new Movie("No Time To Die", "action", 163, 2021);
        movieRepository.save(movie11);

        Movie movie12 = new Movie("Jujutsu Kaisen 0: The Movie", "action", 112, 2021);
        movieRepository.save(movie12);

        Movie movie13 = new Movie("Batman Begins", "thriller", 140, 2005);
        movieRepository.save(movie13);

        Movie movie14 = new Movie("The Dark Knight Rises", "thriller", 165, 2012);
        movieRepository.save(movie14);

        Movie movie15 = new Movie("The Dark Knight", "thriller", 152, 2008);
        movieRepository.save(movie15);

        Movie movie16 = new Movie("Avatar", "fantasy", 162, 2009);
        movieRepository.save(movie16);

        Movie movie17 = new Movie("Pokemon 4Ever: Celebi - Voice of the Forest", "animation", 75, 2001);
        movieRepository.save(movie17);

        Movie movie18 = new Movie("Shrek", "animation", 90, 2001);
        movieRepository.save(movie18);

        Movie movie19 = new Movie("Shrek 2", "animation", 93, 2004);
        movieRepository.save(movie19);

        Movie movie20 = new Movie("Inception", "sci-fi", 148, 2010);
        movieRepository.save(movie20);

        Movie movie21 = new Movie("Interstellar", "adventure", 169, 2014);
        movieRepository.save(movie21);

        Movie movie22 = new Movie("Star Wars: Episode IV - A New Hope", "adventure", 121, 1977);
        movieRepository.save(movie22);

        Movie movie23 = new Movie("Casino Royale", "action", 144, 2006);
        movieRepository.save(movie23);

        Movie movie24 = new Movie("Saw", "horror", 103, 2004);
        movieRepository.save(movie24);

        Movie movie25 = new Movie("The Departed", "thriller", 151, 2006);
        movieRepository.save(movie25);

        Movie movie26 = new Movie("The Lion King", "animation", 88, 1994);
        movieRepository.save(movie26);

        Movie movie27 = new Movie("Thor", "action", 115, 2011);
        movieRepository.save(movie27);

        Movie movie28 = new Movie("Saw II", "horror", 193, 2005);
        movieRepository.save(movie28);

        Movie movie29 = new Movie("The Terminator", "sci-fi", 107, 1984);
        movieRepository.save(movie29);

        Movie movie30 = new Movie("Hulk", "action", 138, 2003);
        movieRepository.save(movie30);



////        Reviews
        Review review1 = new Review(9, "Phil was amazing in this movie", movie1, user1);
        reviewService.addReview(review1);

        Review review2 = new Review(8, "Right off the bat the movie just grabs you and keeps you on the end he of your seat.",movie2, user2);
        reviewService.addReview(review2);

        Review review3 = new Review(4, "This film has got to be the epitome of terrible writing and should be a classroom example of 'what not to do",movie3, user3);
        reviewService.addReview(review3);

        Review review4 = new Review(7, "Not a fan but I'll tell you why it's a hit. It looked VERY CLEAN and BRIGHT from start to finish. ", movie4, user4);
        reviewService.addReview(review4);

        Review review5 = new Review(2, "The plot is non-existent with the actors just going through the motions and the dialogue is sooo boring its embarrassing. ", movie5, user5);
        reviewService.addReview(review5);

        Review review6 = new Review(8, "What a great movie!",movie2, user1);
        reviewService.addReview(review6);

        Review review7 = new Review(8, "Robert Downey Jr played the character so well, he carries the movie.",movie3, user5);
        reviewService.addReview(review7);

        Review review8 = new Review(2, "After learning NASA has never been to the moon, so called space movies are not as exciting.", movie4, user2);
        reviewService.addReview(review8);

        Review review9 = new Review(6, "The movie was decent.", movie10, user5);
        reviewService.addReview(review9);

        Review review10 = new Review(5, "I don't see what the fuss is about to be honest",movie2, user2);
        reviewService.addReview(review10);

        Review review11 = new Review(6,"Alright...",movie2, user7);
        reviewService.addReview(review11);

        Review review12 = new Review(9, "Very interesting movie ", movie2, user10);
        reviewService.addReview(review12);

        Review review13 = new Review(7, "This movie has made me want to become a coder.", movie2, user9);
        reviewService.addReview(review13);

////        ONE USER MANY REVIEWS
        Review review14 = new Review(4, "I found the movie to be a bit boring. Very drawn out that I just wanted the film to end.", movie4, user1);
        reviewService.addReview(review14);

        Review review15 = new Review(10, "I know it sounds a bit too cliché when someone says this, but this is undoubtedly one of, if not the best superhero movie ever created! ", movie15, user2);
        reviewService.addReview(review15);

        Review review16 = new Review(10, "One of the greatest films ever made.  ", movie1, user2);
        reviewService.addReview(review16);

        Review review17 = new Review(10, "Best superhero movie ever!!", movie13, user9);
        reviewService.addReview(review17);

        Review review18 = new Review(9, "Nolan completes the triology with another amazing film!",movie14, user9);
        reviewService.addReview(review18);

        Review review19 = new Review(9, "Great start to the trilogy.",movie15, user9);
        reviewService.addReview(review19);

        Review review20 = new Review(9, "Great movie but can't believe they killed Bond!!!!!! ", movie11, user9);
        reviewService.addReview(review20);

        Review review21 = new Review(3, " I rarely stop watching a movie although how crappy it is. Well for this one I made an exception since its beyond boring. I can't leave long reviews so this is it.. SKIP It", movie9, user9);
        reviewService.addReview(review21);

        Review review22 = new Review(9, "No Time To Die was indeed a great way to end Daniel Craig's tenure as James Bond.",movie11, user7);
        reviewService.addReview(review22);

        Review review23 = new Review(8,   "Knowing it is the 3rd highest grossing film of all time as of now, I can imagine why!", movie6, user8);
        reviewService.addReview(review23);

        Review review24 = new Review(9, "Amazing plot, amazing cast, AMAZING MOVIE!",movie7, user7);
        reviewService.addReview(review24);

        Review review25 = new Review(7, "One of the greatest Bond movies. ", movie8, user6);
        reviewService.addReview(review25);

        Review review26 = new Review(4, "this sucked.",movie9, user7);
        reviewService.addReview(review26);

        Review review27 = new Review(6, "Not as good as the first one!!!!!! ", movie10, user8);
        reviewService.addReview(review27);

        Review review28 = new Review(7, "Didn't think it was that bad but Amber Heard LOL.",movie9, user6);
        reviewService.addReview(review28);

        Review review29 = new Review(6, "I'll say it again Robert Downey Jr carrying this franchise again", movie10, user5);
        reviewService.addReview(review29);

        Review review30 = new Review(6, "wtf just happened", movie11, user2);
        reviewService.addReview(review30);

        Review review31 = new Review(9, "Great film, animation is top notch. Can't wait for season 2!", movie12, user6);
        reviewService.addReview(review31);

        Review review32 = new Review(10, "Lived up to the hype 10/10 would recommend", movie12, user8);
        reviewService.addReview(review32);




        Review review33 = new Review(5, "Just some blue people. I don' understand the hype.", movie16, user6);
        reviewService.addReview(review33);

        Review review34 = new Review(10, "I really love Pokemon!! Who wants to see my pokemon API?.  ", movie17, user8);
        reviewService.addReview(review34);

        Review review35 = new Review(8, "Classic", movie18, user8);
        reviewService.addReview(review35);

        Review review36 = new Review(6, "Not as good as 1.!",movie19, user10);
        reviewService.addReview(review36);

        Review review37 = new Review(6, "I'm so confused...",movie20, user10);
        reviewService.addReview(review37);

        Review review38 = new Review(7, "Great picture. ", movie21, user10);
        reviewService.addReview(review38);

        Review review39 = new Review(8, "Timeless. Way better than the new ones.", movie22, user9);
        reviewService.addReview(review39);

        Review review40 = new Review(9, "Best Bond movie ever!!!",movie23, user7);
        reviewService.addReview(review40);

        Review review41 = new Review(6,   "I should not have let my 4 year old watch this....", movie24, user8);
        reviewService.addReview(review41);

        Review review42 = new Review(9, "So many plot twists, loved it.",movie25, user7);
        reviewService.addReview(review42);

        Review review43 = new Review(9, "SIMBA!!!", movie26, user6);
        reviewService.addReview(review43);

        Review review44 = new Review(4, "this sucked.",movie27, user7);
        reviewService.addReview(review44);

        Review review45 = new Review(7, "My favourite avenger!", movie28, user8);
        reviewService.addReview(review45);

        Review review46 = new Review(7, "Scary!!",movie29, user6);
        reviewService.addReview(review46);

        Review review47 = new Review(7, "I love Arnold!", movie30, user5);
        reviewService.addReview(review47);

        Review review48 = new Review(6, "HULK SMASH!!", movie30, user2);
        reviewService.addReview(review48);

        Review review49 = new Review(9, "Alan Turing...what a man.",movie2, user1);
        reviewService.addReview(review49);

        Review review50 = new Review(8, "Great historical movie.",movie2, user3);
        reviewService.addReview(review50);

        Review review51 = new Review(8, "Entertaining and educational.",movie2, user4);
        reviewService.addReview(review51);

        Review review52 = new Review(10, "Favourite movie of the year.",movie2, user5);
        reviewService.addReview(review52);

        Review review53 = new Review(8, "Masterpiece",movie2, user6);
        reviewService.addReview(review53);
    }
}