package com.example.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "Java_lang", title = "Java Fundamentals: The Java Language")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "java_core", title = "Java Fundamentals: The Java Platform")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes() {
        var note = NoteInfo(CourseInfo("android_intents", "Android Programming with Intents"),"Dynamic Intent Resolution","Wow intents allow components to be resolved at runtime")
          notes.add(note)

        note = NoteInfo(CourseInfo("android_intents", "Android Programming with Intents"), "Parameters", "Leverage variable-length parameter lists")
        notes.add(note)
    }
}