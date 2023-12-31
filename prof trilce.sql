PGDMP     ,    9                 {            profesores-trilce    14.8    15.2 U    J           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            K           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            L           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            M           1262    16394    profesores-trilce    DATABASE     �   CREATE DATABASE "profesores-trilce" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Spain.1252';
 #   DROP DATABASE "profesores-trilce";
                postgres    false                        2615    2200    public    SCHEMA     2   -- *not* creating schema, since initdb creates it
 2   -- *not* dropping schema, since initdb creates it
                postgres    false            N           0    0    SCHEMA public    ACL     Q   REVOKE USAGE ON SCHEMA public FROM PUBLIC;
GRANT ALL ON SCHEMA public TO PUBLIC;
                   postgres    false    4            �            1259    16475    horarios    TABLE     3  CREATE TABLE public.horarios (
    id_horario bigint NOT NULL,
    profesor_id bigint NOT NULL,
    sede_id bigint NOT NULL,
    silabo_id bigint NOT NULL,
    seccion character varying(255) NOT NULL,
    h_inicio_hora bigint,
    h_inicio_minutos bigint,
    h_fin_hora bigint,
    h_fin_minutos bigint
);
    DROP TABLE public.horarios;
       public         heap    postgres    false    4            �            1259    16474    Horarios_idHorario_seq    SEQUENCE     �   CREATE SEQUENCE public."Horarios_idHorario_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public."Horarios_idHorario_seq";
       public          postgres    false    225    4            O           0    0    Horarios_idHorario_seq    SEQUENCE OWNED BY     T   ALTER SEQUENCE public."Horarios_idHorario_seq" OWNED BY public.horarios.id_horario;
          public          postgres    false    224            �            1259    16410    cursos    TABLE     o   CREATE TABLE public.cursos (
    id_curso bigint NOT NULL,
    nombre_curso character varying(255) NOT NULL
);
    DROP TABLE public.cursos;
       public         heap    postgres    false    4            �            1259    16409    cursos_idcurso_seq    SEQUENCE     �   CREATE SEQUENCE public.cursos_idcurso_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.cursos_idcurso_seq;
       public          postgres    false    4    213            P           0    0    cursos_idcurso_seq    SEQUENCE OWNED BY     J   ALTER SEQUENCE public.cursos_idcurso_seq OWNED BY public.cursos.id_curso;
          public          postgres    false    212            �            1259    16676 
   cursos_seq    SEQUENCE     t   CREATE SEQUENCE public.cursos_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 !   DROP SEQUENCE public.cursos_seq;
       public          postgres    false    4            �            1259    16463    desarrollo_clase    TABLE     �   CREATE TABLE public.desarrollo_clase (
    id_dc bigint NOT NULL,
    tema_clase_id bigint NOT NULL,
    material_clase character varying(255) NOT NULL
);
 $   DROP TABLE public.desarrollo_clase;
       public         heap    postgres    false    4            �            1259    16462    desarrolloClase_id-dc_seq    SEQUENCE     �   CREATE SEQUENCE public."desarrolloClase_id-dc_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public."desarrolloClase_id-dc_seq";
       public          postgres    false    4    223            Q           0    0    desarrolloClase_id-dc_seq    SEQUENCE OWNED BY     Z   ALTER SEQUENCE public."desarrolloClase_id-dc_seq" OWNED BY public.desarrollo_clase.id_dc;
          public          postgres    false    222            �            1259    16677    desarrollo_clase_seq    SEQUENCE     ~   CREATE SEQUENCE public.desarrollo_clase_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.desarrollo_clase_seq;
       public          postgres    false    4            �            1259    16417    grado_escolar    TABLE     �   CREATE TABLE public.grado_escolar (
    id_ge bigint NOT NULL,
    grado character varying(255) NOT NULL,
    tipo_grado character varying(255) NOT NULL
);
 !   DROP TABLE public.grado_escolar;
       public         heap    postgres    false    4            �            1259    16416    grado-escolar_id-ge_seq    SEQUENCE     �   CREATE SEQUENCE public."grado-escolar_id-ge_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public."grado-escolar_id-ge_seq";
       public          postgres    false    4    215            R           0    0    grado-escolar_id-ge_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public."grado-escolar_id-ge_seq" OWNED BY public.grado_escolar.id_ge;
          public          postgres    false    214            �            1259    16678    grado_escolar_seq    SEQUENCE     {   CREATE SEQUENCE public.grado_escolar_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.grado_escolar_seq;
       public          postgres    false    4            �            1259    16679    horarios_seq    SEQUENCE     v   CREATE SEQUENCE public.horarios_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.horarios_seq;
       public          postgres    false    4            �            1259    16395 
   profesores    TABLE     �  CREATE TABLE public.profesores (
    dni bigint NOT NULL,
    nombres character varying(255) NOT NULL,
    app character varying(255) NOT NULL,
    apm character varying(255) NOT NULL,
    email character varying(255) NOT NULL,
    pass character varying(255) NOT NULL,
    esuperior character varying(255) NOT NULL,
    tipoesuperior character varying(255) NOT NULL,
    ieducativa character varying(255) NOT NULL
);
    DROP TABLE public.profesores;
       public         heap    postgres    false    4            �            1259    16403    sedes    TABLE     �   CREATE TABLE public.sedes (
    id bigint NOT NULL,
    nombresede character varying(255) NOT NULL,
    distrito character varying(255) NOT NULL,
    direccion character varying(255) NOT NULL
);
    DROP TABLE public.sedes;
       public         heap    postgres    false    4            �            1259    16402    sedes_id_seq    SEQUENCE     �   CREATE SEQUENCE public.sedes_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.sedes_id_seq;
       public          postgres    false    211    4            S           0    0    sedes_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.sedes_id_seq OWNED BY public.sedes.id;
          public          postgres    false    210            �            1259    16680 	   sedes_seq    SEQUENCE     s   CREATE SEQUENCE public.sedes_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
     DROP SEQUENCE public.sedes_seq;
       public          postgres    false    4            �            1259    16426    silabo    TABLE     �   CREATE TABLE public.silabo (
    id_silabo bigint NOT NULL,
    curso_id bigint NOT NULL,
    ge_id bigint NOT NULL,
    yearmaking bigint
);
    DROP TABLE public.silabo;
       public         heap    postgres    false    4            �            1259    16424    silabo_curso-id_seq    SEQUENCE     �   CREATE SEQUENCE public."silabo_curso-id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public."silabo_curso-id_seq";
       public          postgres    false    4    219            T           0    0    silabo_curso-id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public."silabo_curso-id_seq" OWNED BY public.silabo.curso_id;
          public          postgres    false    217            �            1259    16425    silabo_ge-id_seq    SEQUENCE     �   CREATE SEQUENCE public."silabo_ge-id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public."silabo_ge-id_seq";
       public          postgres    false    219    4            U           0    0    silabo_ge-id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public."silabo_ge-id_seq" OWNED BY public.silabo.ge_id;
          public          postgres    false    218            �            1259    16423    silabo_idsilabo_seq    SEQUENCE     �   CREATE SEQUENCE public.silabo_idsilabo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.silabo_idsilabo_seq;
       public          postgres    false    219    4            V           0    0    silabo_idsilabo_seq    SEQUENCE OWNED BY     L   ALTER SEQUENCE public.silabo_idsilabo_seq OWNED BY public.silabo.id_silabo;
          public          postgres    false    216            �            1259    16681 
   silabo_seq    SEQUENCE     t   CREATE SEQUENCE public.silabo_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 !   DROP SEQUENCE public.silabo_seq;
       public          postgres    false    4            �            1259    16451    temas_clases    TABLE     �   CREATE TABLE public.temas_clases (
    id_temas bigint NOT NULL,
    silabo_id bigint NOT NULL,
    nombre_tema character varying(255) NOT NULL,
    descripcion character varying(255) NOT NULL
);
     DROP TABLE public.temas_clases;
       public         heap    postgres    false    4            �            1259    16450    temasClases_idTemas_seq    SEQUENCE     �   CREATE SEQUENCE public."temasClases_idTemas_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public."temasClases_idTemas_seq";
       public          postgres    false    221    4            W           0    0    temasClases_idTemas_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public."temasClases_idTemas_seq" OWNED BY public.temas_clases.id_temas;
          public          postgres    false    220            �            1259    16682    temas_clases_seq    SEQUENCE     z   CREATE SEQUENCE public.temas_clases_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.temas_clases_seq;
       public          postgres    false    4            �           2604    16496    cursos id_curso    DEFAULT     q   ALTER TABLE ONLY public.cursos ALTER COLUMN id_curso SET DEFAULT nextval('public.cursos_idcurso_seq'::regclass);
 >   ALTER TABLE public.cursos ALTER COLUMN id_curso DROP DEFAULT;
       public          postgres    false    212    213    213            �           2604    16508    desarrollo_clase id_dc    DEFAULT     �   ALTER TABLE ONLY public.desarrollo_clase ALTER COLUMN id_dc SET DEFAULT nextval('public."desarrolloClase_id-dc_seq"'::regclass);
 E   ALTER TABLE public.desarrollo_clase ALTER COLUMN id_dc DROP DEFAULT;
       public          postgres    false    223    222    223            �           2604    16524    grado_escolar id_ge    DEFAULT     |   ALTER TABLE ONLY public.grado_escolar ALTER COLUMN id_ge SET DEFAULT nextval('public."grado-escolar_id-ge_seq"'::regclass);
 B   ALTER TABLE public.grado_escolar ALTER COLUMN id_ge DROP DEFAULT;
       public          postgres    false    215    214    215            �           2604    16538    horarios id_horario    DEFAULT     {   ALTER TABLE ONLY public.horarios ALTER COLUMN id_horario SET DEFAULT nextval('public."Horarios_idHorario_seq"'::regclass);
 B   ALTER TABLE public.horarios ALTER COLUMN id_horario DROP DEFAULT;
       public          postgres    false    225    224    225            �           2604    16601    sedes id    DEFAULT     d   ALTER TABLE ONLY public.sedes ALTER COLUMN id SET DEFAULT nextval('public.sedes_id_seq'::regclass);
 7   ALTER TABLE public.sedes ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    211    210    211            �           2604    16615    silabo id_silabo    DEFAULT     s   ALTER TABLE ONLY public.silabo ALTER COLUMN id_silabo SET DEFAULT nextval('public.silabo_idsilabo_seq'::regclass);
 ?   ALTER TABLE public.silabo ALTER COLUMN id_silabo DROP DEFAULT;
       public          postgres    false    216    219    219            �           2604    16651    temas_clases id_temas    DEFAULT     ~   ALTER TABLE ONLY public.temas_clases ALTER COLUMN id_temas SET DEFAULT nextval('public."temasClases_idTemas_seq"'::regclass);
 D   ALTER TABLE public.temas_clases ALTER COLUMN id_temas DROP DEFAULT;
       public          postgres    false    220    221    221            4          0    16410    cursos 
   TABLE DATA           8   COPY public.cursos (id_curso, nombre_curso) FROM stdin;
    public          postgres    false    213   -_       >          0    16463    desarrollo_clase 
   TABLE DATA           P   COPY public.desarrollo_clase (id_dc, tema_clase_id, material_clase) FROM stdin;
    public          postgres    false    223   �_       6          0    16417    grado_escolar 
   TABLE DATA           A   COPY public.grado_escolar (id_ge, grado, tipo_grado) FROM stdin;
    public          postgres    false    215   �`       @          0    16475    horarios 
   TABLE DATA           �   COPY public.horarios (id_horario, profesor_id, sede_id, silabo_id, seccion, h_inicio_hora, h_inicio_minutos, h_fin_hora, h_fin_minutos) FROM stdin;
    public          postgres    false    225   a       0          0    16395 
   profesores 
   TABLE DATA           o   COPY public.profesores (dni, nombres, app, apm, email, pass, esuperior, tipoesuperior, ieducativa) FROM stdin;
    public          postgres    false    209   pa       2          0    16403    sedes 
   TABLE DATA           D   COPY public.sedes (id, nombresede, distrito, direccion) FROM stdin;
    public          postgres    false    211   c       :          0    16426    silabo 
   TABLE DATA           H   COPY public.silabo (id_silabo, curso_id, ge_id, yearmaking) FROM stdin;
    public          postgres    false    219   Id       <          0    16451    temas_clases 
   TABLE DATA           U   COPY public.temas_clases (id_temas, silabo_id, nombre_tema, descripcion) FROM stdin;
    public          postgres    false    221   �d       X           0    0    Horarios_idHorario_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public."Horarios_idHorario_seq"', 2, true);
          public          postgres    false    224            Y           0    0    cursos_idcurso_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.cursos_idcurso_seq', 26, true);
          public          postgres    false    212            Z           0    0 
   cursos_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.cursos_seq', 351, true);
          public          postgres    false    226            [           0    0    desarrolloClase_id-dc_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public."desarrolloClase_id-dc_seq"', 4, true);
          public          postgres    false    222            \           0    0    desarrollo_clase_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.desarrollo_clase_seq', 201, true);
          public          postgres    false    227            ]           0    0    grado-escolar_id-ge_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public."grado-escolar_id-ge_seq"', 9, true);
          public          postgres    false    214            ^           0    0    grado_escolar_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.grado_escolar_seq', 51, true);
          public          postgres    false    228            _           0    0    horarios_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.horarios_seq', 351, true);
          public          postgres    false    229            `           0    0    sedes_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.sedes_id_seq', 11, true);
          public          postgres    false    210            a           0    0 	   sedes_seq    SEQUENCE SET     8   SELECT pg_catalog.setval('public.sedes_seq', 51, true);
          public          postgres    false    230            b           0    0    silabo_curso-id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public."silabo_curso-id_seq"', 1, false);
          public          postgres    false    217            c           0    0    silabo_ge-id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public."silabo_ge-id_seq"', 1, false);
          public          postgres    false    218            d           0    0    silabo_idsilabo_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.silabo_idsilabo_seq', 11, true);
          public          postgres    false    216            e           0    0 
   silabo_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.silabo_seq', 301, true);
          public          postgres    false    231            f           0    0    temasClases_idTemas_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public."temasClases_idTemas_seq"', 4, true);
          public          postgres    false    220            g           0    0    temas_clases_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.temas_clases_seq', 351, true);
          public          postgres    false    232            �           2606    16540    horarios Horarios_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.horarios
    ADD CONSTRAINT "Horarios_pkey" PRIMARY KEY (id_horario);
 B   ALTER TABLE ONLY public.horarios DROP CONSTRAINT "Horarios_pkey";
       public            postgres    false    225            �           2606    16498    cursos cursos_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.cursos
    ADD CONSTRAINT cursos_pkey PRIMARY KEY (id_curso);
 <   ALTER TABLE ONLY public.cursos DROP CONSTRAINT cursos_pkey;
       public            postgres    false    213            �           2606    16510 %   desarrollo_clase desarrolloClase_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.desarrollo_clase
    ADD CONSTRAINT "desarrolloClase_pkey" PRIMARY KEY (id_dc);
 Q   ALTER TABLE ONLY public.desarrollo_clase DROP CONSTRAINT "desarrolloClase_pkey";
       public            postgres    false    223            �           2606    16526     grado_escolar grado-escolar_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.grado_escolar
    ADD CONSTRAINT "grado-escolar_pkey" PRIMARY KEY (id_ge);
 L   ALTER TABLE ONLY public.grado_escolar DROP CONSTRAINT "grado-escolar_pkey";
       public            postgres    false    215            �           2606    16589    profesores profesores_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.profesores
    ADD CONSTRAINT profesores_pkey PRIMARY KEY (dni);
 D   ALTER TABLE ONLY public.profesores DROP CONSTRAINT profesores_pkey;
       public            postgres    false    209            �           2606    16603    sedes sedes_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.sedes
    ADD CONSTRAINT sedes_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.sedes DROP CONSTRAINT sedes_pkey;
       public            postgres    false    211            �           2606    16617    silabo silabo_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.silabo
    ADD CONSTRAINT silabo_pkey PRIMARY KEY (id_silabo);
 <   ALTER TABLE ONLY public.silabo DROP CONSTRAINT silabo_pkey;
       public            postgres    false    219            �           2606    16653    temas_clases temasClases_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.temas_clases
    ADD CONSTRAINT "temasClases_pkey" PRIMARY KEY (id_temas);
 I   ALTER TABLE ONLY public.temas_clases DROP CONSTRAINT "temasClases_pkey";
       public            postgres    false    221            �           2606    16633    silabo fk-curso    FK CONSTRAINT     x   ALTER TABLE ONLY public.silabo
    ADD CONSTRAINT "fk-curso" FOREIGN KEY (curso_id) REFERENCES public.cursos(id_curso);
 ;   ALTER TABLE ONLY public.silabo DROP CONSTRAINT "fk-curso";
       public          postgres    false    219    213    3219            �           2606    16642    silabo fk-ge    FK CONSTRAINT     v   ALTER TABLE ONLY public.silabo
    ADD CONSTRAINT "fk-ge" FOREIGN KEY (ge_id) REFERENCES public.grado_escolar(id_ge);
 8   ALTER TABLE ONLY public.silabo DROP CONSTRAINT "fk-ge";
       public          postgres    false    3221    219    215            �           2606    16590    horarios fk-profesor    FK CONSTRAINT        ALTER TABLE ONLY public.horarios
    ADD CONSTRAINT "fk-profesor" FOREIGN KEY (profesor_id) REFERENCES public.profesores(dni);
 @   ALTER TABLE ONLY public.horarios DROP CONSTRAINT "fk-profesor";
       public          postgres    false    209    225    3215            �           2606    16604    horarios fk-sede    FK CONSTRAINT     q   ALTER TABLE ONLY public.horarios
    ADD CONSTRAINT "fk-sede" FOREIGN KEY (sede_id) REFERENCES public.sedes(id);
 <   ALTER TABLE ONLY public.horarios DROP CONSTRAINT "fk-sede";
       public          postgres    false    211    225    3217            �           2606    16623    horarios fk-silabo    FK CONSTRAINT     }   ALTER TABLE ONLY public.horarios
    ADD CONSTRAINT "fk-silabo" FOREIGN KEY (silabo_id) REFERENCES public.silabo(id_silabo);
 >   ALTER TABLE ONLY public.horarios DROP CONSTRAINT "fk-silabo";
       public          postgres    false    219    3223    225            �           2606    16654    desarrollo_clase fk-temaclase    FK CONSTRAINT     �   ALTER TABLE ONLY public.desarrollo_clase
    ADD CONSTRAINT "fk-temaclase" FOREIGN KEY (tema_clase_id) REFERENCES public.temas_clases(id_temas);
 I   ALTER TABLE ONLY public.desarrollo_clase DROP CONSTRAINT "fk-temaclase";
       public          postgres    false    221    3225    223            �           2606    16665    temas_clases fk_silabo    FK CONSTRAINT        ALTER TABLE ONLY public.temas_clases
    ADD CONSTRAINT fk_silabo FOREIGN KEY (silabo_id) REFERENCES public.silabo(id_silabo);
 @   ALTER TABLE ONLY public.temas_clases DROP CONSTRAINT fk_silabo;
       public          postgres    false    221    219    3223            4   �   x�U���0���� �Z؂���D�$�4A�����H+8p�l���[�`O��!#��Lb7`�_sZ �@Q��4� gy��[���F!�AIVïoj���@^8$�<%.!F���q��Ό� NGJ�6�N*p�{�8��5��N�����G2��Gœ)��|?hk�e�K�¾�y��"��.��B�,TV�      >   �   x�u�AB!�u�K���q������@��b\\��-f���rz`������Qv��~34��7�[� ~�6�x����t�{�KKOՖ�}m�� �[�|��,5免�?G�g�y3Ƽ�DW�      6   l   x�M��� F��?UX�YD]����fR�5lcOs|_�ŀ�];gaauNuΘ��>��۸�Z�&5���Q�.i3����c�q�����WD�r���D� �c9p      @   [   x�u�;� ��z�{3A��s�+
����v��oH#9�!��M�|.{�	#�O�9k�C�z��ђ5�2��~k	�<�?���7Sh      0   �  x��RKn�@]ӧ�	;I�.k�)� ^uU�zD�4F�2�!�!A�]�!G�G����mvڳ�f�I;��[�L?��D|�}.Ic�����onI�8��okƤ�d*L��(-�����X)�X_�n���i�O�M�Ώ'�Tg4�F����%e-�r܆<L���D5i������	.�p�~���fFҲ�^ԫ墥o8�V���:.�J�G���w��R����#R�K��-m����Ar������[G���9��H3I~S�XQ��6���<j�#��������[�i��n�k�5�e�����ɹ�.���1y'5�4p�	��c^9A0"Η�_xYB�����_+]-��{6cB�-֒1�N���r�����o����b��p$�      2   *  x�mP]N�0~NN��e[a�/^j&OI\���z+���p��ɒ��7��	'R��ձBFet8AO0e8�\+���3tM�Rt�4b/�$�+��G���;�b��S"�̉�H��f�wI*H�I����N��Q��4#�0��}��W�M�L�En@�h��ǭq�4c�o�Q֤���lO	�H�
K�қ��D�o��K��a�����M�D)w�w��50�cE*3��aM�����v�a�&�K��4�k3I�Y�TQo�\Ll�N��>�Ea��Y�������y��      :   E   x�5͹�0Cњ&�h��%����O$���̆f�B������Ńy�ef��İk�߇���l      <   �   x�e�Mn� ���> ���lz�n�D�F*͹z�^���H�]!�������mj�1o=�N�Ja�IaE���!zh\D�l�ęP!K�5�w@�%��&��
�-	���)F�42�֢�7X��"X��X��)C� GݥR0��?�rZ��4O�69D�}�h��r��0�A�u�>o�$��+BW�O����P�B6̧q#]8s���ܣ���N]�K���p7Q<D�)�Y�t�/ι���(     