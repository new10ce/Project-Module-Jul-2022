package com.scaler.todo_withdb.tasks;

import com.scaler.todo_withdb.common.BaseEntity;
import com.scaler.todo_withdb.notes.NoteEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "tasks")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
public class TaskEntity extends BaseEntity {

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "due_date", nullable = false)
    Date dueDate;

    @Column(name = "done", nullable = false, columnDefinition = "boolean default false")
    boolean done;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    @ToString.Exclude
    List<NoteEntity> notes;

    public void setNotes(List<NoteEntity> notes){
        this.notes = notes;
    }
}
