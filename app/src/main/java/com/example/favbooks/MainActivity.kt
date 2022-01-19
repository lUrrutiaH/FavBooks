package com.example.favbooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.favbooks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), FavoriteBooksClickListenerClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(booklist)
        }
    }

    override fun onClick(myBooks: Books) {
        val intent = Intent(applicationContext, DetailActivity::class.java )
        intent.putExtra(BOOK_ID_DETAILS, myBooks.id)
        startActivity(intent)
    }

    private fun populateBooks() {
        val book1 = Books(
            R.drawable.atomichabits,
            "James Clear",
            "Atomic Habits",
            "Atomic Habits will reshape the way you think about progress and success, and give you the tools and strategies you need to transform your habits--whether you are a team looking to win a championship, an organization hoping to redefine an industry, or simply an individual who wishes to quit smoking, lose weight, reduce stress, or achieve any other goal."
        )
        booklist.add(book1)

        val book2 = Books(
            R.drawable.drjekyllandmrhyde,
            "Robert Louis Stevenson",
            "Dr. Jekyll and Mr. Hyde",
            "Dr. Jekyll and Mr. Hyde is as an allegory about the good and evil that exist in all men, and about our struggle with these two sides of our personality. In the novella the battle between good and evil rages within the individual."
        )
        booklist.add(book2)

        val book3 = Books(
            R.drawable.dune,
            "Frank Herbert",
            "Dune",
            "Set on the desert planet Arrakis, Dune is the story of the boy Paul Atreides, heir to a noble family tasked with ruling an inhospitable world where the only thing of value is the “spice” melange, a drug capable of extending life and enhancing consciousness. Coveted across the known universe, melange is a prize worth killing for..."
        )
        booklist.add(book3)

        val book4 = Books(
            R.drawable.harrypotter,
            "J.K. Rowling",
            "Harry Potter and the Sorcerer's Stone",
            "Harry Potter's life is miserable. His parents are dead and he's stuck with his heartless relatives, who force him to live in a tiny closet under the stairs. But his fortune changes when he receives a letter that tells him the truth about himself: he's a wizard. A mysterious visitor rescues him from his relatives and takes him to his new home, Hogwarts School of Witchcraft and Wizardry."
        )
        booklist.add(book4)

        val book5 = Books(
            R.drawable.labyrinthlost,
            "Zoraida Córdova ",
            "Labyrinth Lost",
            "Alex is a bruja, the most powerful witch in a generation…and she hates magic. At her Deathday celebration, Alex performs a spell to rid herself of her power. But it backfires. Her whole family vanishes into thin air, leaving her alone with Nova, a brujo she can’t trust, but who may be Alex’s only chance at saving her family. "
        )
        booklist.add(book5)

        val book6 = Books(
            R.drawable.meditations,
            "Marcus Aurelius",
            "Meditations",
            "Written in Greek by the only Roman emperor who was also a philosopher, without any intention of publication, the Meditations of Marcus Aurelius offer a remarkable series of challenging spiritual reflections and exercises developed as the emperor struggled to understand himself and make sense of the universe. While the Meditations were composed to provide personal consolation and encouragement, Marcus Aurelius also created one of the greatest of all works of philosophy: a timeless collection that has been consulted and admired by statesmen, thinkers and readers throughout the centuries."
        )
        booklist.add(book6)

        val book7 = Books(
            R.drawable.mistborn,
            "Brandon Sanderson",
            "Mistborn: The Final Empire",
            "For a thousand years the ash fell and no flowers bloomed. For a thousand years the Skaa slaved in misery and lived in fear. For a thousand years the Lord Ruler, the \"Sliver of Infinity,\" reigned with absolute power and ultimate terror, divinely invincible. Then, when hope was so long lost that not even its memory remained, a terribly scarred, heart-broken half-Skaa rediscovered it in the depths of the Lord Ruler's most hellish prison. Kelsier \"snapped\" and found in himself the powers of a Mistborn. A brilliant thief and natural leader, he turned his talents to the ultimate caper, with the Lord Ruler himself as the mark.\n"
        )
        booklist.add(book7)

        val book8 = Books(
            R.drawable.thedivinecomedy,
            "Dante Alighieri",
            "The Divine Comedy",
            "The Divine Comedy describes Dante's descent into Hell with Virgil as a guide; his ascent of Mount Purgatory and encounter with his dead love, Beatrice; and finally, his arrival in Heaven. Examining questions of faith, desire and enlightenment, the poem is a brilliantly nuanced and moving allegory of human redemption."
        )
        booklist.add(book8)

        val book9 = Books(
            R.drawable.theartofwar,
            "Sun Tzu",
            "The Art of War",
            "Twenty-Five Hundred years ago, Sun Tzu wrote this classic book of military strategy based on Chinese warfare and military thought. Since that time, all levels of military have used the teaching on Sun Tzu to warfare and civilization have adapted these teachings for use in politics, business and everyday life. The Art of War is a book which should be used to gain advantage of opponents in the boardroom and battlefield alike."
        )
        booklist.add(book9)

        val book10 = Books(
            R.drawable.thefellowshipofthering,
            "J.R.R. Tolkien",
            "The Fellowship of the Ring",
            "In ancient times the Rings of Power were crafted by the Elven-smiths, and Sauron, The Dark Lord, forged the One Ring, filling it with his own power so that he could rule all others. But the One Ring was taken from him, and though he sought it throughout Middle-earth, it remained lost to him. After many ages it fell into the hands of Bilbo Baggins, as told in The Hobbit."
        )
        booklist.add(book10)

    }

}