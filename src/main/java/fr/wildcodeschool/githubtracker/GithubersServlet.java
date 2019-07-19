package fr.wildcodeschool.githubtracker;

import fr.wildcodeschool.githubtracker.model.Githubers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "GithubersServlet", urlPatterns = {"/githubers"})
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Githubers firstGithuber = new Githubers("Edwin","edwinbeledu@yahoo.fr","wendydrack","01","https://github.com/beleduedwin");
        Githubers secondGithuber = new Githubers("Sarah","sarah@orange.fr","sara01","02","https://github.com/test");
        Githubers thirdGithuber = new Githubers("Patricia","patricia@hotmail.com","patr","03","test");
        Githubers fourthGithuber = new Githubers("Joel","joel@gmail.com","jobell","04","test");
        Githubers fifthGithuber = new Githubers("Max","max@yahoo.fr","maxpot","07","test");

        //transmission de la liste de Githubers à la jsp
        List<Githubers> githubersList =Arrays.asList(firstGithuber, secondGithuber, thirdGithuber, fourthGithuber, fifthGithuber);
        request.setAttribute("githubersList", githubersList);

        request.getRequestDispatcher("/githubers.jsp").forward(request, response);
    }
}
