package com.cieep;

import com.cieep.modelos.Alumno;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Edu", "Sanz", "1234567H");

        //CREA LA VARIABLE QUE PUEDE CONECTAR
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //LA VARIABLE DE LA CONEXION
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //INSERTAR UN OBJETO -> CREATE
        session.persist(alumno);
        session.getTransaction().commit();

        session.beginTransaction();
        //TRAERNOS UN OBJETO -> READ
       Alumno a = session.get(Alumno.class, 2);
        System.out.println(a.toString());

        //UPDATE
        a.setNombre("Eduard");
        session.merge(a);

        //DELETE
        //session.remove(a);



        session.getTransaction().commit();

        session.close();


    }
}