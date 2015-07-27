/**
 * Copyright (c) 2009 Cliffano Subagio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.plugins.grizz;

import java.util.Random;

/**
 * {@link FactGenerator} provides Grizz facts.
 * @author cliffano
 */
public class FactGenerator {
    private static final String[] FACTS = {
        "Grizz can dereference void pointers",
        "Grizz only has one nickname: Cluster Buster",
        "I'm just the plumber...",
        "TLA!  TLA!  TLA!",
        "I'm like a little intern in your computer.",
        "Don't buy more hardware, just get more interns.",
        "With Grizz, there are no bugs, only features.",
        "Grizz's first program was kill -9.",
        "Grizz writes code that optimizes itself.",
        "Grizz can write infinite recursion functions... and have them return.",
        "Grizz can solve the Towers of Hanoi in one move.",
        "Grizz finished World of Warcraft.",
        "Project managers never ask Grizz for estimations... ever.",
        "\"It works on my machine\" always holds true for Grizz.",
        "Grizz's beard can type 140 wpm.",
        "Grizz can unit test an entire application with a single assert.",
        "Grizz can access private methods.",
        "Grizz can instantiate an abstract class.",
        "The class object inherits from Grizz.",
        "For Grizz, NP-Hard = O(1).",
        "Grizz knows the last digit of PI.",
        "Grizz can divide by zero.",
        "Grizz doesn't get compiler errors, the language changes itself to accommodate Grizz.",
        "Grizz doesn't believe in floating point numbers because they can't be typed on his binary keyboard.",
        "Grizz solved the Travelling Salesman problem in O(1) time.",
        "Grizz never gets a syntax error. Instead, the language gets a DoesNotConformToDerrick error.",
        "No statement can catch the GrizzException.",
        "Grizz can write multi-threaded applications with a single thread.",
        "Grizz can binary search unsorted data.",
        "Grizz breaks RSA 128-bit encrypted codes in milliseconds.",
        "Grizz went out of an infinite loop.",
        "Grizz hosting is 101% uptime guaranteed.",
        "Grizz rewrote the Google search engine from scratch.",
        "Grizz doesn't need the cloud to scale his applications, he uses his laptop.",
        "Grizz's programs occupy 150% of CPU, even when they are not executing.",
        "Grizz can spawn threads that complete before they are started.",
        "Grizz programs do not accept input.",
        "Grizz doesn't need an OS.",
        "Grizz can compile syntax errors.",
        "You don't disable the Grizz plug-in, it disables you.",
        "There is nothing regular about Grizz's expressions.",
        "Grizz's beard is immutable."};

    /**
     * Random instance.
     */
    private static final Random RANDOM = new Random();

    /**
     * Retrieves a random fact.
     * @return a random fact
     */
    public String random() {
        return FACTS[RANDOM.nextInt(FACTS.length)];
    }
}
