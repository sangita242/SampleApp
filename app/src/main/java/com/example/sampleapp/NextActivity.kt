package com.example.sampleapp

import android.app.SearchManager
import androidx.appcompat.widget.SearchView
import android.content.Context
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.renderscript.Sampler
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mancj.materialsearchbar.MaterialSearchBar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_next.*
import kotlinx.android.synthetic.main.chapter_list.*
import kotlinx.android.synthetic.main.example_item.*
import java.time.temporal.TemporalQuery
import kotlin.Boolean as Boolean1


class NextActivity : AppCompatActivity() {

    private lateinit var listViewAdapter: ExpandableListViewAdapter
    private lateinit var chapterList : List<String>
    private lateinit var topicList : HashMap<String, List<String>>




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)



        showList()

        listViewAdapter = ExpandableListViewAdapter(this, chapterList, topicList)
        eListView.setAdapter(listViewAdapter)



    }

    private fun showList() {

        chapterList = ArrayList()
        topicList = HashMap()


        (chapterList as ArrayList<String>).add("Chapter 1")
        (chapterList as ArrayList<String>).add("Chapter 2")
        (chapterList as ArrayList<String>).add("Chapter 3")
        (chapterList as ArrayList<String>).add("Chapter 4")
        (chapterList as ArrayList<String>).add("Chapter 5")

        val topic1 : MutableList<String> = ArrayList()
        topic1.add("Topic 1")
        topic1.add("Topic 2")
        topic1.add("Topic 3")

        val topic2 : MutableList<String> = ArrayList()
        topic2.add("Topic 1")
        topic2.add("Topic 2")
        topic2.add("Topic 3")

        val topic3 : MutableList<String> = ArrayList()
        topic3.add("Topic 1")
        topic3.add("Topic 2")
        topic3.add("Topic 3")

        val topic4 : MutableList<String> = ArrayList()
        topic4.add("Topic 1")
        topic4.add("Topic 2")
        topic4.add("Topic 3")

        val topic5 : MutableList<String> = ArrayList()
        topic5.add("Topic 1")
        topic5.add("Topic 2")
        topic5.add("Topic 3")

        topicList[chapterList[0]] = topic1
        topicList[chapterList[1]] = topic2
        topicList[chapterList[2]] = topic3
        topicList[chapterList[3]] = topic4
        topicList[chapterList[4]] = topic5


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean1 {
        val inflater = menuInflater
        inflater.inflate(R.menu.main, menu)

        //val searchItem: MenuItem? = menu?.findItem(R.id.search)
        //val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        //val searchView = searchItem?.actionView as SearchView


        //searchView?.setSearchableInfo(searchManager.getSearchableInfo(componentName))


        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean1 {
        var selectedOption = ""
        when(item?.itemId){

            R.id.my_profile -> selectedOption ="My Profile"
            R.id.help -> selectedOption ="Help"
            R.id.item_1 -> selectedOption ="Item 1"
            R.id.item_2 -> selectedOption ="Item 2"
            R.id.item_3 -> selectedOption ="Item 3"
            R.id.search -> selectedOption ="Search"



        }
        Toast.makeText(this,"Option : " + selectedOption,Toast.LENGTH_SHORT).show()

        return super.onOptionsItemSelected(item)
    }

        }












