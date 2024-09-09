# CSC207 Week 1 Lab Activity #1: Fizz Buzz
Let's start off our exploration of Java with a classic programming challenge, Fizz Buzz!

But first, let's get you your own copy of this codebase to work with.

## Task 0 Forking a public repository on GitHub

You should be currently reading this README on GitHub in the code repository:
https://github.com/CSC207-2024F-UofT/FizzBuzz/

1. Make sure you are logged into GitHub. You should see a button that says `Fork` in the top-right corner of the page.
Click this button to create a fork of this repository, which will be your own copy of the codebase to edit as you please.
In the new page that comes up, confirm that you want to create the fork and your own FizzBuzz repository will be created
on GitHub!

2. Now that you have your own fork of this repository, close this page, go to your fork, and continue with the next instructions.

3. The next step is to get a local copy of your FizzBuzz repository on your own computer.
This is called **cloning** the repository.
You can do this by clicking the green `Code` button in your FizzBuzz repository on GitHub and copying
the HTTPS URL which you will see. You can copy it by clicking the little 'copy' button with the two rectangles on it.

4. Open IntelliJ. If you already have a project open, close that project. From the main screen, choose
the "Get From VCS" option.
5. In the menu that appears, paste the URL. You can either use the default location on your computer to save the project
or you can choose the directory.
    - Note: if you later make another clone of this repository, it will require you to choose a new directory to save it to,
   since you can't have two projects with the exact same directory.
6. Click the `Clone` button and IntelliJ will set up your project. At this point, it may require you to set up an
access token to be able to clone the repository from GitHub if you didn't previously do so in the
software setup instructions on Quercus.

* Now that you have a copy of the code on your computer, you can proceed to work through the rest of the activity
in IntelliJ. Open this `README.md` file in IntelliJ and in the top-right you can toggle between seeing the editor,
editor+preview, or just the preview of this markdown file.
Feel free to take notes in it as you go or just read the preview view of it.

Before we begin, note that IntelliJ is made by the same company as PyCharm, so it should feel quite familiar to you,
with the only difference being that we'll be working with Java code instead of Python code of course!

### Aside: getting to know markdown
The markdown format is commonly used for things like readme files, as they allow for simple syntax to be incorporated,
which allows for basic typesetting when viewed while still being a plaintext format.

Below is a blank checkbox:
- [X] Put an X in the [ ] to mark this as done!

You can edit this file directly to check off these checkboxes throughout the lab to mark things as done.
Do so now for the checkbox above.

And now, back to Fizz Buzz!

## Fizz Buzz

Fizz Buzz is a game where people sit in a circle. Counting from 1 and going around the circle,
people say one of four things for a number `i`: `Fizz`, `Buzz`, `Fizz Buzz`, or `i`.

- [X] Try a short game of Fizz Buzz with a small group of people around you!

Formally as a coding task, let `i` be a positive integer and output the following:

* If `i` is divisible by 3, print the string `Fizz`
* If `i` is divisible by 5, print the string `Buzz`
* If `i` is divisible by 3 and 5, print the string `Fizz Buzz` (note the space)
* Otherwise, print the value of `i`

So, starting with `i = 1` and counting until `i = 6` we would get:

```
1
2
Fizz
4
Buzz
Fizz
```

To solve this programmatically, we must create different outputs based on a number
we continually increment. It is a classic technical interview question.

Let's explore a solution written in Java.

## A Java version

```java
/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
    }
}
```

- [X] Open `FizzBuzz.java` in the `src` directory and click the run button in the top left corner.

If you don't see this button, you may need to mark `src` as the `Sources Root` for the project. You can do this
by right-clicking the `src` directory in the `Project` tab and near the bottom of the context menu
you will see `Mark Directory as`. Hover that and then select `Sources Root`. Then run the file.
The program may take a second to compile and run, but then you should see that it prints out the first 100 outputs of
this Fizz Buzz problem. Note: you may also need to set your project SDK before you can run your code. There will
be a warning message in IntelliJ if this is the case and you can click the message to set up the SDK.

You may never have seen Java before, but we bet you can puzzle out how it works.

## Task 1: Understanding some Java syntax

Take a few minutes to read through this code and take guesses at what different pieces of
the code are doing. For example, what's the Java version of Python's `and`? What's going
on with that weird `for` loop? As you do this, you might find it useful to write down your
own implementation in Python to help you begin to create a mapping between the two languages.

- [X] Make note of any specific Java syntax which stands out to you and compare what you
come up with those around you. Try to come up with a list of at least five things that
strike you as either similar to or different from Python.

Tip: IntelliJ works just like PyCharm, so you can place breakpoints and step through the code using the debugger in the same way.
You might find it informative to try stepping through the code to see what it is doing on a few iterations.

## The Main Function

In Python, any code that you write in a file will get run when you execute the file.
This is not the case in Java. You must define a method called `main` in a class
and tell Java to run the file containing that class.

```java
public static void main(String[] args)
```

This is the main method, the entry point of your program. You have installed Java,
and it is, loosely speaking, a program that knows how to compile and run your program — it calls
method `main` in the file you choose to run.

Later in this course, you'll learn what all that mess means, but for now it is enough to know that the main method gets run.

### Task 1.1: Rewrite this using `while`

- [X] You've puzzled through how Java `for` and `if` statements work; now rewrite this
to use a `while` loop instead of a `for` loop.

## How to test this code

How do you know that it's correct? Part of the problem here is that we can't
easily test this program. The iteration and the calculation are tightly coupled.
If we refactored this by extracting the body of the loop into a method, we could
test the calculation for several interesting numbers more easily.

## Task 2: How to refactor this code using IntelliJ

1. Select all the lines inside the body of the loop. Don't include the for/while
line or the closing brace `}` of the loop.

2. Now select menu item `Refactor —> Extract/Introduce —> Method…`

3. Immediately, type the method name you want, maybe something like `doFizzBuzz`.

- [X] Rerun the program to verify that it still works.

That's your first big IntelliJ trick! There are lots more.

Note: Recall that in Python we were in the habit of defining helpers with a leading underscore to mark them as being
private — only to be called by the method using it as a helper and not by anyone outside the class. IntelliJ has done
something similar here — when it extracted this method, it used the `private` access modifier for the extracted method.
You'll learn more about the various access modifiers in your Java readings soon.

### Task 2.1: Publishing your changes

Now that you've made your first edits to your code, you should ask git to save these changes for you.

- [X] Open the Terminal tab in IntelliJ and type `git status`, it will show you that you have modified `FizzBuzz.java` (and this README too!).

We will save our local changes to `FizzBuzz.java` and then push the changes to your GitHub repository using
a sequence of three git commands:

1. `git add src/FizzBuzz.java`
   - this tells git to "stage" our changes to FizzBuzz.java. If you run `git status` again, you will see
   that `FizzBuzz.java` has a new status.
2. `git commit -m "refactored to extract helper method"`
   - this actually records your changes to all "staged" files to your local git repository. You can again
   run `git status` to see what has happened.
   - And if you run `git log`, you will see a record of all commits made so far in the repository.
   - The `-m "refactored to extract helper method"` is the message briefly documenting what changes were made.
   You can put whatever message you want in the quotes, but try to keep it short and descriptive.
3. `git push`
   - this last step is what actually sends your committed changes to your remote GitHub repository.
   - IMPORTANT: You likely won't have your system configured for this command to actually work directly, so you
   will need to do the actual push using IntelliJ. See the first tip below, which mentions how to perform
   the relevant git operations through IntelliJ's graphical user interface.

- [X] Once you execute these commands, you can check your GitHub repository to confirm that the changes have been made there.

- [X] repeat the above steps for `README.md` (or try using the approach below).

Tip: You can also use IntelliJ to execute these same steps using the graphical user interface it provides.
If you have followed the software installation instructions, you should see `Git` in the menu bar at the top.
From that you can select `Commit...`, which will allow you to add and commit files (you use checkboxes to
indicate which files to add and put the commit message in the textbox, then press the commit button).
That menu also gives you the option to commit and push in one step if you wish to do so.
If you chose to only commit, then you can later go back to the `Git` menu and choose `Push...` to open a
menu to then push your commits to your remote GitHub repository. When you try to push, you will be prompted
to provide a GitHub access Token to authenticate if you haven't already added one. There will be a `Generate...`
button in the popup. Clicking that will take you to a GitHub page which will generate the token for you. Once
you generate the token, you copy it into the dialog box in IntelliJ and the push should go through. If you
have trouble with this, please ask and someone around can help you through the steps.

Tip: It is good practice to get in the habit of making commits that are small and have a distinct purpose.
For example, one might imagine making a commit each time they complete a task they are working on or finish
making edits to a specific file. Keeping your commits small will allow your commit messages to remain short and descriptive.
You can make a sequence of adds and commits without pushing. Whenever you decide to push, you can push all of
the commits at once. As you work through the lab today, we encourage you to practice commiting your changes regularly
(the exact frequency is up to you, but the instructions will remind you periodically!).

Now, back to exploring the code!

## Task 3: Seeing private in action

To briefly observe what private does, let's create a new class.

- [ ] Right-click on `src` and select `New —> Java Class`. Name it `Main`. This will create a `Main.java` file.

We'll write a main method which will attempt to call `FizzBuzz.doFizzBuzz` (or whatever you called
your extracted helper method).

- [ ] To quickly generate `main`, you can start typing `psvm` in IntelliJ and then press Enter to accept the
autocomplete — it will generate an empty "public static void main" (psvm) method for you. Neat!

- [ ] In the body of this main method, type `FizzBuzz.`. You'll see that the private helper method doesn't
appear in the autocomplete, but `FizzBuzz.main` does! If you wanted to be able to call the helper from
inside `Main.java`, you would need to change the access modifier on the helper.
It turns out that IntelliJ can help us out with this too!

### Task 3.1: Changing access modifiers using IntelliJ

- [ ] In your main method in `Main.java`, try calling your private helper — something like `FizzBuzz.doFizzBuzz(5);`.

You'll see that IntelliJ flags that you are trying to access something that is private. Unlike Python,
Java won't even let you run the code when it detects this kind of violation of an access modifier (it is an
error and not just a warning).

- [ ] Hover over the error; IntelliJ will suggest some fixes.

- [ ] Click `More actions...` and you'll see a list of the various possible access modifiers.
These will be explained in more detail in your readings, but for now we can just make the method public.

- [ ] Choose this fix and the error will go away. Try running `Main.java` to see if it outputs
what you expect.

### Task 3.2: Calling `FizzBuzz.main` from `Main.main`

Suppose we wanted to execute a line like `FizzBuzz.main();` in `Main.main`. Why doesn't this work?

If you add this line to `Main.main`, IntelliJ will tell you the problem and suggest some fixes,
but neither of them will *directly* fix the problem.

* Talk with your neighbours to try to find the best way to resolve the problem so that you can run `Main.java` and
see the expected output of executing `FizzBuzz.main`. If you come up with different ways to do this,
think about how they differ and which might be best.

And that's all we wanted to highlight with this first example. You'll see and learn much more Java syntax as you work
through the readings and coding homework over the next few of weeks.

### Task 3.3 Push your latest changes

- [ ] Now that you've made some more changes to your repository, you should repeat the add, commit, push process
for any files that you have changed if you haven't done so recently. Remember to include a descriptive commit message!

### Task 3.4 Pulling changes from GitHub

So far we have only talked about how to *push local changes* to a remote repository on GitHub. In practice, several
programmers will often be working in the same remote repository. So when one programmer pushes their changes, everyone
else needs a way to update their local copies to reflect these changes. Git provides a command for just that!

You can use `git pull` to get the latest changes from the remote repository. Note: you have to be careful though, because
if you have local changes to the same files, then there could be conflicting changes which will need to be resolved. We'll
talk more about that complication later — but just know that since such conflicts can so easily arise git has
ways to help you resolve such conflicts without too much difficulty.

To get your first experience with `git pull`, you can make a quick change to one of the files in your Fizz Buzz repository
on GitHub.

- [ ] Open any of the files (like this readme file, for example) on the GitHub webpage for your repository. Near the
right side of the screen, you should see an edit button (with a pencil on it). Click that and make a small edit to
the file. Then click the commit button to commit the change to the repository.

This change has now been made on GitHub,
but your local copy doesn't know about the change yet.

- [ ] In IntelliJ, you can either click the `Git` menu and choose `Pull...`,
or you can run `git pull` from the Terminal tab. Once you have done the pull, you should see the commit show up in
your local repository.

Let's move on to a couple more small programming challenges for you to try out, which are similar to Fizz Buzz.

# Technical interviews  (and Java practice)

Technical interviews for developer internships often have you write
some code. It usually uses first- and second-year material, and many students
practice these kinds of problems regularly over the academic year to gain confidence in tackling them.

As part of this week's homework, you'll solve two of them. You can get a start on them now in lab, but you'll make some
minor modifications on your own after and submit your code on MarkUs using git (with the same add,
commit, push steps you learned in lab this week).

## Task 4: Multiples of 3 and 5

- [ ] Right-click on `src` and select `New —> Java Class`. Name it `Multiples`.

We're looking for non-negative multiples of 3 or 5. The first four are 3, 5, 6, and 9, so there are
four below 10. How many are below 1000?

- [ ] In `Multiples.java`, write a main method that **prints** how many multiples of 3 or 5 there are below 1000.
Add this file to your project, commit, and push. Check your repo on GitHub to confirm your changes were pushed successfully.

Tip: Just like with `psvm`, you can start typing `sout` and then press Enter to generate `System.out.println();` in IntelliJ.

If you don't get the right answer, that's okay for now.
This is to get you to practice. You'll have until the end of the week to work out the details and submit your
working code on MarkUs.

## Task 5: Reduce a number to 0

- [ ] Right-click on `src` and select `New —> Java Class`. Name it `Reduce`.

Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.

For example, if you start with n = 2, the answer is 2.
Details: 2 (even, divide by 2) --> 1 (odd, subtract 1) --> 0.

- [ ] In `Reduce.java`, write a main method that prints how many steps it takes to reach 0 if you start at 100.
Add this file to your project, commit, and push. If you don't get the right answer, that's okay for now.
This is to get you to practice. You'll have until the end of the week to work out the details and
submit your working code on MarkUs.

And that's it for the first lab activity of the term!

- [ ] Check with those around you to see how many commits you each made during the lab. You can view the log of commits on GitHub or
      use the `git log` command to view a summary of the commits to the repository.

## Coding homework for this week
See the Week 2 module on Quercus for how to get started on the part of the homework related to the above two problems.

## Learning Java
You should start working through the learning Java materials available on Quercus. This will more formally
cover a lot of the syntax which you just saw for possibly the first time during the lab today.

## Further practice

[LeetCode](https://leetcode.com) is a very popular source of practice problems.
[CoderByte](https://www.coderbyte.com/) is another. 
If you are looking to apply for a software developer internship, we recommend that you practice these kinds of
problems over the year. These platforms also support various programming languages, so solving these
problems is a great way to practice Java or any other new language you later want to learn.
This term, you might find it interesting to try solving some problems first in Python and then in Java.

## Bonus: Collaboration with git (only if you have time)

If you have time left in the lab, you might try experimenting with how git works when you have
a shared repository with multiple people contributing code. We'll be doing some similar exercises in
the next labs, as this will be important when you work on your projects, so this is optional for now.

Note: you can also walk through this on your own by creating multiple clones of your
own repository.

We'll briefly summarize two approaches you might take for this:

### Forking and requesting to make a contribution

1. Share your FizzBuzz GitHub repository URL with another student in the class.

2. Have them make a fork of your repository; just as you did at the start of this activity.

3. Have you each make a change to your GitHub repositories (as you did in Task 3.4 before).

4. Anyone with a fork of your repository will see an option to sync with your repository.
Similarly, they will also see an option to contribute their changes to your original fork.
The mechanism by which this contribution is done is a **pull request**. As the name suggests,
you are requesting that, roughly speaking, the original repository do a `git pull` to pull in your commits. We'll talk
more about pull requests later, but feel free to try it out now by following the instructions that
appear when you click the button to contribute.

### Giving someone else direct access to your GitHub repository

1. Click on the Settings tab for your repository on GitHub (the right-most tab). In it, there is a Collaborators tab (top-left).
Click on it and then you will see a button to add people to your project.

2. Add the other person to your project. They can now clone your repository directly using
the HTTPS URL as you did during the lab.

3. Now, if one of you makes a local change and then pushes it,
the other one of you will need to do a `git pull` to get the changes. Of course, if you both make changes
and try to push, there may be conflicting changes which need to be resolved. As mentioned earlier,
git does a pretty good job telling you what is wrong and can help you resolve any conflicts. We'll talk more about
this later, as well as other features of git which can help you avoid conflicts.
