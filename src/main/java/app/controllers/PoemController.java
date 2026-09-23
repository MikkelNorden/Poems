package app.controllers;

import app.entities.Poem;
import io.javalin.http.Context;

import java.util.LinkedHashMap;
import java.util.Map;

public class PoemController {

    Map<Integer, Poem> poems = new LinkedHashMap<>();
    Poem poem1 = new Poem(
            "The Life Of A Cupcake",
            "Shelby Greer",
            "I was in class one day and I got bored and was really hungry, so I decided to write a poem about what I was craving at the time!!",
            "They put me in the oven to bake.\n" +
                    "Me, a deprived and miserable cake.\n" +
                    "Feeling the heat, I started to bubble.\n" +
                    "Watching the others, I knew I was in trouble.\n" +
                    "\n" +
                    "They opened the door and I started my life.\n" +
                    "Frosting me with a silver knife,\n" +
                    "Decorating me with candy jewels.\n" +
                    "The rest of my batch looked like fools.\n" +
                    "\n" +
                    "Lifting me up, she took off my wrapper.\n" +
                    "Feeling the breeze, I wanted to slap her.\n" +
                    "Opening her mouth with shiny teeth inside,\n" +
                    "This was the day this cupcake died."
    );

    Poem poem2 = new Poem(
            "Our Imperfect Dog",
            "Cynthia C. Naspinski",
            "Our dog's misdemeanours and idiosyncrasies are what make her endearing.....well, maybe not all of the time.",
            "We love our dog with all our hearts,\n" +
                    "But not so much her stinky farts.\n" +
                    "Her doggy breath is less than fresh,\n" +
                    "Yet we hug her nonetheless.\n" +
                    "\n" +
                    "From barking she will not refrain.\n" +
                    "The house and yard are her domain.\n" +
                    "Park on the street or walk on past,\n" +
                    "And you will likely cop a blast.\n" +
                    "\n" +
                    "Meter readers, couriers,\n" +
                    "Serve to make her furious.\n" +
                    "Possums, lizards, neighbour's cat,\n" +
                    "Will not be shown the welcome mat.\n" +
                    "\n" +
                    "In the name of crime prevention,\n" +
                    "Airspace gets the same attention.\n" +
                    "We feel safe, it must be said,\n" +
                    "From birds that dare fly overhead.\n" +
                    "\n" +
                    "She wages war with the lawn mower,\n" +
                    "Outdoor sweeper and leaf blower.\n" +
                    "And switching on the vacuum cleaner\n" +
                    "Won't bring out her best demeanour.\n" +
                    "\n" +
                    "This causes some embarrassment,\n" +
                    "This doggy form of harassment,\n" +
                    "But she does provide protection,\n" +
                    "And for that we feel affection.\n" +
                    "\n" +
                    "Once introductions make the rounds,\n" +
                    "Her friendliness, it knows no bounds.\n" +
                    "Though not all guests are fully rapt\n" +
                    "With thirty kilos on their lap.\n" +
                    "\n" +
                    "Should you leave your nice warm chair,\n" +
                    "On your return you'll find her there.\n" +
                    "And when she's urged to please vacate,\n" +
                    "She'll turn into a limp, dead weight.\n" +
                    "\n" +
                    "To baths she has a strong aversion,\n" +
                    "Desperate to avoid immersion.\n" +
                    "Yet she'll display her dive technique\n" +
                    "In any muddy pond or creek!\n" +
                    "\n" +
                    "We give her scratches, make her smile.\n" +
                    "Give an inch, she'll take a mile.\n" +
                    "Stop and she'll demand still more,\n" +
                    "Prodding you with paw and claw.\n" +
                    "\n" +
                    "\"She's got character!\" we all say.\n" +
                    "At times it's just a nicer way\n" +
                    "Of saying she's our problem child,\n" +
                    "Kinda crazy, kinda wild.\n" +
                    "\n" +
                    "For all her faults we love her dearly\n" +
                    "And in turn she loves us clearly.\n" +
                    "She's our funny, gorgeous girl.\n" +
                    "We wouldn't trade for all the world."
    );

    Poem poem3 = new Poem(
            "The Ballad Of Rum",
            "Peter R Wolveridge",
            "A story based on a real dog who still watches over our yard in his own way.",
            "A dog wandered into our garden one day,\n" +
                    "A friendly old mutt, didn't look like a stray.\n" +
                    "We never discovered whence he had come,\n" +
                    "But we brushed him and fed him and the kids called him Rum.\n" +
                    "\n" +
                    "Now as family members, even dogs must work hard,\n" +
                    "So we put Rum on duty next door in our yard,\n" +
                    "Bright eyed and watchful by night and by day,\n" +
                    "But not much of a guard dog, I'm sorry to say.\n" +
                    "\n" +
                    "He barked at the cats and he'd bark at a toad,\n" +
                    "He barked at the cattle outside on the road,\n" +
                    "He barked at the horses - so where did he fail?\n" +
                    "You see, Rum liked people, and he just wagged his tail.\n" +
                    "\n" +
                    "He liked the yard labour, an amiable bunch.\n" +
                    "They fed our dog tidbits and scraps from their lunch.\n" +
                    "Rum wolfed it all down, but to our dismay\n" +
                    "He seemed to get fatter with each passing day.\n" +
                    "\n" +
                    "Then one night when Rum was laid at his ease,\n" +
                    "A burglar crept in just as quiet as you please.\n" +
                    "He saw no alarms, heard no siren howling,\n" +
                    "No guard dog for sure, there'd be barking and growling.\n" +
                    "\n" +
                    "But Rum was awake and he'd seen him alright,\n" +
                    "Delighted with company this time of the night,\n" +
                    "He flew through the yard, his new friend to greet,\n" +
                    "And his weight bowled the burglar right off of his feet.\n" +
                    "\n" +
                    "The intruder got up and ran off with a wail\n" +
                    "And Rum right behind him still wagging his tail.\n" +
                    "He departed the yard he'd come in to burgle\n" +
                    "Like a champion athlete clearing a hurdle.\n" +
                    "\n" +
                    "But Rum couldn't jump gates, so sadly instead\n" +
                    "He picked up the thief's wallet and went back to bed.\n" +
                    "Next morning the evidence everyone viewed,\n" +
                    "When Rum brought it to us, (just a little bit chewed).\n" +
                    "\n" +
                    "Once given the wallet, the police didn't fail\n" +
                    "To capture the burglar and put him in jail.\n" +
                    "His confession like wildfire spread through the town,\n" +
                    "How a big vicious guard dog had knocked the thief down.\n" +
                    "\n" +
                    "We all howled with laughter when we heard the story,\n" +
                    "And Rum was our hero, he was basking in glory.\n" +
                    "There's been no attempts since to burgle our yard,\n" +
                    "For everyone knows now that Rum is on guard."
    );

    Poem poem4 = new Poem(
            "The Snakes At School",
            "Pamela J. Langdon",
            "Based on a true story. A typically Australian story. The snakes were all recovered and returned to their creek, but important lessons had been learned.",
            "It wasn't that we hated school.\n" +
                    "The creek enticed us more.\n" +
                    "My mate and I hung out there\n" +
                    "To chase frogs, catch fish, explore.\n" +
                    "\n" +
                    "One day we built a fortress,\n" +
                    "Moved rocks and tied some stakes.\n" +
                    "Then we saw a wondrous sight -\n" +
                    "A ball of baby snakes.\n" +
                    "\n" +
                    "We should have pondered longer,\n" +
                    "But we thought our find so cool.\n" +
                    "We stuffed the snakes into our bags\n" +
                    "And took them back to school.\n" +
                    "\n" +
                    "Just as the school bell jangled\n" +
                    "And the halls began to fill,\n" +
                    "We flung the snakes along the floor.\n" +
                    "Then screams rang loud and shrill.\n" +
                    "\n" +
                    "We expected just a ripple,\n" +
                    "A tiny bit of fun.\n" +
                    "Some girls might get a little fright\n" +
                    "And some may even run.\n" +
                    "\n" +
                    "Instead, it was a tidal wave.\n" +
                    "Chairs and lockers tumbled\n" +
                    "As kids and teachers panicked.\n" +
                    "Our confidence soon crumbled.\n" +
                    "\n" +
                    "The hallway was a war zone.\n" +
                    "The floor all strewn with rubble.\n" +
                    "Though the baby snakes were harmless,\n" +
                    "We knew we were in trouble.\n" +
                    "\n" +
                    "Our tender ages saved us.\n" +
                    "We learned we crossed a line.\n" +
                    "They talked of court and consequences\n" +
                    "And preached \"moral decline.\"\n" +
                    "\n" +
                    "But we learned some worthy lessons\n" +
                    "Though were left in some confusion.\n" +
                    "When our penalty for wagging school\n" +
                    "Was to get a week's exclusion.\n" +
                    "\n" +
                    "And though we were repentant\n" +
                    "And we did receive a fright,\n" +
                    "Others often broke the rules\n" +
                    "And their punishment seemed light.\n" +
                    "\n" +
                    "They swore and called the teacher names.\n" +
                    "We saw them fight and smoke,\n" +
                    "But we learned that day the greater sin\n" +
                    "Was to play a practical joke."
    );

    Poem poem5 = new Poem(
            "Gullible Guy",
            "Richard Thomas",
            "When a schoolboy, I was captivated by the rhythmic, metered verses of Poe and Kipling. Now retired, I enjoy writing similar, though much inferior, poems.",
            "I'm a pigeon and pushover, patsy and prey\n" +
                    "Who's persuaded by pitches of grifters to pay.\n" +
                    "I'm a con artist's picnic and flimflammer's feast\n" +
                    "Who is fooled and finagled and flummoxed and fleeced.\n" +
                    "\n" +
                    "I'm a victim of vultures whose ventures go bad.\n" +
                    "I've been hustled and hornswoggled, hoodwinked and had.\n" +
                    "I'm a sap who's been stung, up the creek, and at sea\n" +
                    "Giving scammers and scoundrels more income tax-free.\n" +
                    "\n" +
                    "I'm as lamb led to altar and cash cow that's milked\n" +
                    "As I'm buffaloed, badgered, bamboozled and bilked.\n" +
                    "I'm a sucker who's snookered and dupe being rooked\n" +
                    "And a chicken for plucking and goose to be cooked.\n" +
                    "\n" +
                    "In the dark and adrift, sinking deep in the red,\n" +
                    "I'm a mark who is miffed as by leeches I'm bled.\n" +
                    "Being led by the nose, I am cozened and coaxed;\n" +
                    "Easy pickings for pros and too frequently hoaxed.\n" +
                    "\n" +
                    "Shrinks and therapists say I exaggerate facts;\n" +
                    "That though poorer each day, I should try to relax.\n" +
                    "But despite expertise of those women and men,\n" +
                    "When I hand them their fees, I feel swindled again.\n" +
                    "\n" +
                    "                           ADDENDUM\n" +
                    "\n" +
                    "Now I'm bankrupt and broke as the day I was born,\n" +
                    "Feeling down and disgusted and shorn and forlorn.\n" +
                    "But I just met a stranger who sure thing has planned\n" +
                    "That will rich make us both if you lend me ten grand."
    );

    public void addPoems() {
        poems.put(1, poem1);
        poems.put(2, poem2);
        poems.put(3, poem3);
        poems.put(4, poem4);
        poems.put(5, poem5);
    }

    public Map<Integer, Poem> getPoemList() {
        return poems;
    }

    public void getAllPoems(Context ctx) {
        ctx.json(poems.values());
    }

}