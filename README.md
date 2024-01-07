# platformcommon

Entity Layer:

1.Student Entity:
Attributes: name, dateOfBirth, gender, uniqueStudentCode
Relationship: One-to-Many with StudentAddress
StudentAddress Entity:
Attributes: area, state, district, pincode, addressType
Course Entity:
Attributes: courseName, description, courseType, duration, topics
Relationship: Many-to-Many with Student
Repository Layer:

2. StudentRepository: Interface extending JpaRepository for CRUD operations on Student.
CourseRepository: Interface extending JpaRepository for CRUD operations on Course.
Controller Layer:

3. AdminController:
Endpoints for operations 1, 2, 3, 4, 5.
StudentController:
Endpoints for operations 1, 2, 3.
Business Layer (Service):

4. AdminService: Business logic for admin operations.
StudentService: Business logic for student operations.
Security:

Use Spring Security for securing endpoints, allowing only authorized access.




Use Postman to test your API endpoints.
Authentication and Authorization:

Implement authentication for admins and students.
Apply authorization rules to ensure that only authenticated users can perform certain actions.





![Screenshot (384)](https://github.com/Raushan1234567/platformcommon/assets/115460955/d2a4e4e1-05b2-44d3-8ccf-dde56f32f7a3)


