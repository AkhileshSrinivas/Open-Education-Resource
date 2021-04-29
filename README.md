# Open Educational Resources Repository Platform

Open Educational Resources (OER) are freely accessible, openly licensed documents and media that are useful for teaching, learning, and assessing as well as for research purposes. OER could be in the form of any file format (images, videos, text documents, rich text documents, audio files, etc.), and as of now there is no universally accepted standard(s) for OER creation. The author creating an OER should specify an appropriate copyleft license. Some of the well known open content licenses available are Creative Commons Attribution (CC BY), Creative Commons ShareAlike (CC BY-SA), Public Domain Dedication (CC0), GNU Free Documentation License (GFDL), Free Art License (FAL), etc. Digital libraries have metadata for easy retrieval, and management of information resource. Metadata can describe resources at any level of composition and aggregation. It can describe a collection, a single resource, or a component of a larger resource (for example, a chapter in a book). Standards for metadata in digital libraries include Dublin Core, METS, MODS, DDI, DOI, URN, PREMIS schema, EML, and OAI-PMH.

# System Architecture:

![alt text](https://res.cloudinary.com/web-dev-app/image/upload/v1619696006/Screenshot_531_xuq9kz.png)

The repository stores the learning object’s metadata based on the IEEE 1484.12.1-2002 Learning Object Metadata (LOM) standard together with the macro- and micro-attributes, while the actual education resource resides in the author’s system.

# System workflow

![alt text](https://res.cloudinary.com/web-dev-app/image/upload/v1619696006/Screenshot_532_ijfxwy.png)

# IMPLEMENTATION

# List of modules:

The modules in this project are:

- Author/Lecturer
- Editor
- User

The key system objects in the proposed chemistry-inspired framework are the learning substances, they acts like atoms, which can be interconnected to form molecules via bonds. The macro- and micro-attributes are assigned to each learning substance to function like nucleus and electrons, respectively. The micro-attributes are subject specific and usually provide details. The automatic computing or fusion process is used to construct microattributes and each learning molecules is represented using predefined X-ML tags embedded in the metadata.

These keywords can be defined by the contributor, through crowd sourcing and/or by generating them via data or text mining based on the learning object metadata information.

# Module description

1. Author: Author allocates education resources of a running object during a consolidated repository. Exclusively, the repository stocks the learning entity metadata built on the foot of macro and micro traits. There are four sorts of suppliers: author, enhancer, integrator, and recommender.
2. Editor: When writer upload any file the request will go to editor. Editor verifies the file by scrutinizing each and every content of the file and by checking whether the keywords uploaded by the writer are related to the content of file. If editor accept the file then the file will be uploaded in repository and if he rejected the file it will be removed.
3. User: User admittance the process above the internet to chase for culturing molecules. The backside includes the scheme so as to precede the learning entity and user request. There is also a supplementary subsystem to sustain other function for instance applauding erudition objects to user.

User is also able to plea correlated erudition object, all erudition molecules using certain purposes, circumstances plus boundaries. The dispensation subsystem subsequently grips the request and capitulate the consequences to the user, who can access the edification resources on the internet.

![alt text](https://res.cloudinary.com/web-dev-app/image/upload/v1619695309/Screenshot_522_hinn1g.png)

![alt text](https://res.cloudinary.com/web-dev-app/image/upload/v1619695308/Screenshot_523_mcxck7.png)

![alt text](https://res.cloudinary.com/web-dev-app/image/upload/v1619695503/Screenshot_530_ubwe6q.png)

# Author's page

![alt text](https://res.cloudinary.com/web-dev-app/image/upload/v1619695309/Screenshot_524_csoxvi.png)

It permits the author to upload the file and while uploading it display all the keywords which are in history to user so that they can use that keyword as filename while examining and moreover they can add keywords in for file.

![alt text](https://res.cloudinary.com/web-dev-app/image/upload/v1619695309/Screenshot_525_oduiap.png)

Here, it displays how the keywords are added while uploading the file and based on these keyword user will get the file with the support of electron.

# Editor's page

![alt text](https://res.cloudinary.com/web-dev-app/image/upload/v1619695310/Screenshot_526_im2rep.png)

Once the author uploads the file, the file appeal will go to editor so that he can confirm whether the file encompasses accurate data based on the keywords.

![alt text](https://res.cloudinary.com/web-dev-app/image/upload/v1619695310/Screenshot_527_jurucn.png)

Editor will have the power to receive or discard the file if the file does not encompass accurate information related to keywords.

# User's search page

![alt text](https://res.cloudinary.com/web-dev-app/image/upload/v1619695309/Screenshot_528_oq31gk.png)

It displays the keywords based on the electron bonds values which has maximum values. Based on the electrons value, user will get the precise data which they appeal.

![alt text](https://res.cloudinary.com/web-dev-app/image/upload/v1619695309/Screenshot_529_z0w08s.png)

Based on the keywords, user will acquire the data and with the support of electron it will display precise information to user.

# Technologies:

# Front-end

- HTML
- CSS
- Bootstrap
- JavaScript
- JSP

# Back-end

- Java
- Apache Tomcat
- JDBC
- MySql Workbench
